package com.paulhammant.svhttp;

import com.paulhammant.svhttp.svn.SvnHeaderManipulator;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SubversionCheckoutRecorderTest {

    public static final String CHECKOUT_RECORDER_TEST_MD = "./src/test/resources/SubversionCheckoutRecorderTest.md";

    public static void main(String[] args) throws IOException, InterruptedException {

        // Run this main() method from within Intellij

        // Or in the root of this project,
        // do mvn jooby:run

        // then run the following command on the command line (same directory)
        // svn --config-option servers:global:http-proxy-host=localhost --config-option servers:global:http-proxy-port=8099 co http://svn.apache.org/repos/asf/synapse/tags/3.0.0/modules/distribution/src/main/conf/ .svnhttp_tmp/conf

        ServiceInteractionRecorder recorder = new ServiceInteractionRecorder(
                new OkHttpRealServiceInteractor(),
                8099, false, new SvnHeaderManipulator("", ""));
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        FileOutputStream fos = new FileOutputStream(CHECKOUT_RECORDER_TEST_MD);
        recorder.setOutputStream(CHECKOUT_RECORDER_TEST_MD, fos);
        recorder.startApp();

        String tempDir = new File(".").getAbsolutePath() + "/.svhttp_tmp/";
        createWorkDirAndDeleteCheckout(tempDir);

    }

    public static void createWorkDirAndDeleteCheckout(String tempDir) throws IOException {
        new File(tempDir).mkdirs();
        Files.walk(Paths.get(tempDir + "conf"))
                .map(Path::toFile)
                .sorted((o1, o2) -> -o1.compareTo(o2))
                .forEach(File::delete);
    }



}
