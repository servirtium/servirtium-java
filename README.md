# Servirtium

Servirtium == Service Virtualized HTTP (for Java)

**Utilization of "Service Virtualization" is best practice towards fast and 
consistent test automation. This tech should be used in conjunction with 
JUnit/TestNG etc. **

## Design goal 

Is to store conversations in Markdown, co-located with the tests that would be using Servirtium 
to isolate themselves from potentially flaky and unquestionably slow remote service.

And this is just for Java teams. Use [Mountebank](http://mbtest.org) for a more versatile SV 
solution and there's an established [WireMock](http://wiremock.org/) that's available for Java 
solutions.

Not only is this just for Java teams, it is for teams that want to do the testing that would 
poke remote services, but do so **in process** and completely choreographed from the test class
itself. In other words, no other processes involved, even if multiple threads are cooperating 
here.

## What does that look like?

See [ExampleSubversionCheckoutRecording.md](https://github.com/paul-hammant/servirtium/blob/master/src/test/resources/ExampleSubversionCheckoutRecording.md) 
which was recorded from a real Subversion 'svn' command line client doing it's thing, but 
thru Servirtium as a HTTP-proxy. After the recording of that, the replay side of Servirtium was able 
to pretend to be Apache+Subversion for a fresh 'svn checkout' command. 
[This one](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutRecorderMain.java) 
was the recorder, and [this one](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutReplayerMain.java) 
the replayer for that recorded conversation.

## Limitations

1. The recorder **isn't very good at handling parallel requests**. Most of the 
things you want to test will be serial (and  short) but if your client is a browser, 
then you should half expect for parallelized operations.

2. This tech can't function as a HTTP Proxy server over HTTPS. It must be a "man in the middle", 
meaning you have to be able to override the endpoints of services during JUnit/TestNG invocation 
in order to be able to record them (and play them back).
 
3. Some server technologies (like Amazon S3) sign payloads in a way that breaks for middle-man 
deployments. See [S3](https://github.com/paul-hammant/servirtium/wiki/S3).
 
# Notable examples

## SvnMerkleizer project - emulation of Subversion

SvnMerkleizer is very IO heavy to a coupled Subversion instance.  In a mode of operation 
for suite of service tests that use RestAssured to hit SvnMerkleizer which in turn hits Subversion many
times `DirectServiceTests` has no use of Servirtium and takes 1m 40s. A mode of operation that 
uses Servirtium to
record Subversion HTTP requests/responses in `RecordingSubversionServiceTests` takes 2m 13s. A mode of operation that 
plays back the same recording in `PlayingBackSvnMerkleizerServiceTests` takes 24s. 
These tests (whether direct, recording or playing back) are non standard in that they perform (or emulate) 13500 HTTP 
operations to Subversion (Markdown recordings here - TODO), and each of these three modes of operation give 69% code 
coverage to the SvnMerkleizer codebase.

This suite is overkill really, as 13500 HTTP operations recorded into Markdown is too big to be human comprehensible.
For correct usage of Servirtium, you'd have a test that did a handful of HTTP operations at most, and finished 
(playback mode) in less than half a second.

## SvnMerkleizer project - testbase emulation of SvnMerkleizer itself

This is nonsensical as testing mocks is not really legitmate - tests should be of "prod code" with mocks removing dependencies 
on collaborators). However, here is the breakdown:

* RecordingSvnMerkleizerServiceTests - 69% code coverage - 1m 36s
* PlayingBackSvnMerkleizerServiceTests - 10% code coverage - 31s  

The playback shows the lack of coverage of SvnMerkleizer itself. The mocking using Servirtium of SvnMerkleizer is only 
appropriate for **another library/app** that does HTTP calls to a SvnMerkleizer extended Subversion server. For that 
eventuality, these two tests would be copyable to another project. Well, maybe the setup/teardown is. Either way, you'd 
be getting your coverage up to 70% or more again, and not observe it at 10% or below.

## Todobackend record and playback

[TodobackendDotComServiceRecording.md](https://github.com/paul-hammant/servirtium/blob/master/src/test/resources/TodobackendDotComServiceRecording.md) 
is a recording of the Mocha test site of "TodoBackend.com" against a real Ruby/Sinatra/Heroku 
endpoint. This is not an example of something you'd orchestrate in Java/JUnit, but it is 
an example of a sophisticated series of interactions over HTTP between a client (the browser) 
and that Heroku server. Indeed, the intent of the site is show that multiple backends should be
compatible with that JavaScript/Browser test suite.

[Here's the code for the recorder](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutRecorderMain.java) 
of that, and [here's the code for the replayer](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutReplayerMain.java)
for that.  

Note: playback doesn't pass all the tests because there's a randomized GUID in the request 
payload that changes every time you run the test suite. It gets one third of the way through though.

**Note: this limitation is being resolved, presently**

## Readiness for general industry by lovers of test automation?

Nearly ready, but still being actively worked on.

## License & Legal warning

BSD 2-Clause license (open source)

Be careful: your contracts and EULAs with service providers 
(as well as application/server makers for on-premises) might not allow you to 
reverse engineer their over-the-wire APIs.  

A real case: [Reverse engineering of competitor’s software cost company big](http://blog.internetcases.com/2017/10/24/reverse-engineering-of-competitors-software-cost-company-big/) - and you might say that such clauses are needed to prevent licensees from competing with the original company with arguably "stolen" IP. 

We (test engineers) might morally think that we should be OK for this, as we're just doing it for 
test-automation purposes. No matter, the contracts that are signed often make no such distinction, but 
the case above was where the original maker of an API went after a company that was trying to make 
something for the same ecosystem without a commercial relation on that specifically.

## Code of Conduct

Be Nice