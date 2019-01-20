# Servirtium

Servirtium == Service Virtualized HTTP (for Java)

**Utilization of "Service Virtualization" is best practice towards fast and 
consistent test automation. This tech should be used in conjunction with 
JUnit/TestNG etc.**

## Design goal 

Is to store conversations in Markdown, co-located with the tests that would be using Servirtium 
to isolate themselves from potentially flaky and unquestionably slow remote service.

And this is just for Java teams. Use [Mountebank](http://mbtest.org) for a more versatile SV 
solution and there's an established [WireMock](http://wiremock.org/) that's available for Java 
solutions.

## What does that look like?

See [ExampleSubversionCheckoutRecording.md](https://github.com/paul-hammant/servirtium/blob/master/src/test/resources/ExampleSubversionCheckoutRecording.md) 
which was recorded from a real Subversion 'svn' command line client doing it's thing, but 
thru Servirtium as a HTTP-proxy. After the recording of that, the replay side of Servirtium was able 
to pretend to be Apache+Subversion for a fresh 'svn checkout' command. 
[This one](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutRecorderMain.java) 
was the recorder, and [this one](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutReplayerMain.java) 
the replayer for that recorded conversation.

## Limitations

The recorder **isn't very good at handling parallel requests**. Most of the 
things you want to test will be serial (and  short) but if your client is a browser, 
then you should half expect for parallelized operation to mess up a 
recorded conversation. See that here [TodobackendDotComServiceRecording.md](https://github.com/paul-hammant/servirtium/blob/master/src/test/resources/TodobackendDotComServiceRecording.md). 
Interaction 19 has request details but no response details. That's followed by a 
second interaction 19 that has request details and TWO sets of response details - 
ooops. [Here's the code for the recorder](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutRecorderMain.java) 
for that, and [here's the code for the replayer for that](https://github.com/paul-hammant/servirtium/blob/master/src/test/java/com/paulhammant/servirtium/SubversionCheckoutReplayerMain.java) 

**Note: this limitation is being resolved, presently**

## Readiness for general industry by lovers of test automation?

Not ready yet, but being actively worked on.

## OkHttp UniRest recorders

The former is dependable, the latter requires work. See @Ignore in the test suite.

## License & Legal

MIT (open source)

Be careful: your contracts and EULAs with service providers 
(as well as application/server makers for on-premises) might not allow you to 
reverse engineer their over-the-wire APIs.

A real case: [Reverse engineering of competitor’s software cost company big](http://blog.internetcases.com/2017/10/24/reverse-engineering-of-competitors-software-cost-company-big/) - and you might say that such clauses are needed to prevent licensees from competing with the original company with arguably "stolen" IP. 

We (test engineers) might morally think that we should be OK for this, as we're just doing it for test-automation 
purposes. No matter, the contracts that are signed often make no such distinction.

## Code of Conduct

Be Nice