package com.paulhammant.svhttp;

import com.paulhammant.svhttp.svn.SvnHeaderManipulator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.paulhammant.svhttp.SubversionCheckoutRecorderTest.CHECKOUT_RECORDER_TEST_MD;
import static com.paulhammant.svhttp.SubversionCheckoutRecorderTest.createWorkDirAndDeleteCheckout;

public class SubversionCheckoutReplayTest {

    public static void main(String[] args) throws IOException, InterruptedException {

        // Run this main() method from within Intellij

        // Or in the root of this project,
        // do mvn jooby:run

        // then run the following command on the command line (same directory)
        // svn --config-option servers:global:http-proxy-host=localhost --config-option servers:global:http-proxy-port=8099 co http://svn.apache.org/repos/asf/synapse/tags/3.0.0/modules/distribution/src/main/conf/ .svnhttp_tmp/conf

        ServiceInteractionReplayer replayer = new ServiceInteractionReplayer(
                8099, false, new SvnHeaderManipulator("", ""));
        replayer.setPlaybackFilename(CHECKOUT_RECORDER_TEST_MD);
        replayer.startApp();

        String tempDir = new File(".").getAbsolutePath() + "/.svhttp_tmp/";
        createWorkDirAndDeleteCheckout(tempDir);

    }

}
