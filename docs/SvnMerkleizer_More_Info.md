# SvnMerkleizer project - emulation of Subversion

SvnMerkleizer is very I/O heavy to a coupled Subversion server/repository.  In a mode of operation 
for suite of service tests that use RestAssured to hit SvnMerkleizer which in turn hits Subversion many
times `DirectServiceTests` has no use of Servirtium and takes 1m 40s. 

A second mode of operation in this test-suite 
uses Servirtium to
record Subversion HTTP requests/responses in `RecordingSubversionServiceTests` takes 2m 13s. A mode of operation that 
plays back the same recording in `PlayingBackSvnMerkleizerServiceTests` takes 24s. 
These tests (whether direct, recording or playing back) are non standard in that they perform (or emulate) 13,500 HTTP 
operations to Subversion, and each of these three modes of operation give 69% code 
coverage to the SvnMerkleizer codebase for RecordingSubversionServiceTests or 
PlayingBackSvnMerkleizerServiceTests test classes.

This suite is overkill really, as 13,500 HTTP operations recorded into Markdown is too big to be human comprehensible.
For correct usage of Servirtium, you'd have a test that did a handful of HTTP operations at most, and finished 
(playback mode) in less than half a second.

Markdown recordings [here](https://github.com/paul-hammant/SvnMerkleizer/tree/master/src/test/mocks/subversion).

## Architecture diagrams:

(ASCII box art)

[For recording of Subversion in a test class](https://github.com/paul-hammant/SvnMerkleizer/blob/master/src/test/java/com/paulhammant/svnmerkleizer/hiddengetroutes/recorded/subversion/RecordingSubversionServiceTests.java#L59)
[For playback of Subversion in a test class](https://github.com/paul-hammant/SvnMerkleizer/blob/master/src/test/java/com/paulhammant/svnmerkleizer/hiddengetroutes/recorded/subversion/PlayingBackSubversionServiceTests.java#L57)

The playback box art shows two fewer boxes in that mode of operation.  

## Differences between record and playback test for recorded Subversion

![](https://user-images.githubusercontent.com/82182/59253263-b7fcfe00-8c25-11e9-81c3-62111bfe197b.png)

# SvnMerkleizer project - testbase emulation of SvnMerkleizer itself

This is nonsensical as testing mocks is not really legitmate - tests should be of "prod code" with mocks removing dependencies 
on collaborators). However, here is the breakdown:

* RecordingSvnMerkleizerServiceTests - 69% code coverage - 1m 36s
* PlayingBackSvnMerkleizerServiceTests - 0% code coverage - 31s  

The playback shows the lack of coverage of SvnMerkleizer itself. The mocking using Servirtium of SvnMerkleizer is only 
appropriate for **another library/app** that does HTTP calls to a SvnMerkleizer extended Subversion server. For that 
eventuality, these two tests would be copyable to another project. Well, maybe the setup/teardown is. Either way, you'd 
be getting your coverage up to 70% or more again, and not observe it at 10% or below.

Markdown recordings [here](https://github.com/paul-hammant/SvnMerkleizer/tree/master/src/test/mocks/svnmerkleizer).

## Architecture diagrams:

(ASCII box art)

[For recording of SvnMerkleizer in a test class](https://github.com/paul-hammant/SvnMerkleizer/blob/master/src/test/java/com/paulhammant/svnmerkleizer/hiddengetroutes/recorded/svnmerkleizer/RecordingSvnMerkleizerServiceTests.java#L59)
[For playback of SvnMerkleizer in a test class](https://github.com/paul-hammant/SvnMerkleizer/blob/master/src/test/java/com/paulhammant/svnmerkleizer/hiddengetroutes/recorded/svnmerkleizer/PlayingBackSvnMerkleizerServiceTests.java#L55)

The playback box art shows two fewer boxes in that mode of operation.  Coverage is 0% for the 
playback which highlights the folly of this test being in SvnMerkleizer's own codebase - it proves 
nothing at all.

