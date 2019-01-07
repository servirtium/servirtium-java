# SvHttp

SvHttp == Service Virtualized HTTP (for Java)

Design goal - store conversations in Markdown, co-located with the tests that would be using SvHttp 
to isolate themselves from potentially flaky and unquestionably slow remote service.

What does that look like?. See [SubversionCheckoutRecorderTest.md](https://github.com/paul-hammant/svhttp/blob/master/src/test/resources/SubversionCheckoutRecorderTest.md) which was
recorded from a real Subversion 'svn' command line client doing it's thing, but thru SvHttp as a HTTP-proxy. After 
the recording of that, the replay side of SvHttp was able to pretend to be Apache+Subversion for a fresh 'svn checkout' 
command. [This one](https://github.com/paul-hammant/svhttp/blob/master/src/test/java/com/paulhammant/svhttp/SubversionCheckoutRecorderTest.java) 
was the recorder, and [this one](https://github.com/paul-hammant/svhttp/blob/master/src/test/java/com/paulhammant/svhttp/SubversionCheckoutReplayTest.java) 
the replay for that recorded conversation.

The recorder isn't very good at handling parallel requests. Most of the things you want to test will be serial (and 
short) but if your client is a browser, then you should half expect for parallelized operation to mess up a 
recorded conversation. See that here [TodobackendDocTowardsPassingTheirJasmineTestSuite.md](https://github.com/paul-hammant/svhttp/blob/master/src/test/resources/TodobackendDocTowardsPassingTheirJasmineTestSuite.md)

## Project readiness for general industry use

Not ready yet, but being actively worked on.

## OkHttp recorder

Dependable

## UniRest recorder

Has limitations that means that it's not as full featured as the OkHttp recorder (see @Ignore in tests)

# License

MIT

# Code of Conduct

Be Nice