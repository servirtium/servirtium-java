package com.paulhammant.svhttp;

import org.junit.Test;

import java.io.IOException;

import static com.paulhammant.svhttp.SvHttpServer.testName;
import static org.junit.Assert.assertEquals;

public class UtilityTests {

    @Test
    public void testNameCanBeCalculated() throws IOException {
        assertEquals("com.paulhammant.svhttp.UtilityTests.testNameCanBeCalculated", testName());
    }

    @Test
    public void testNameCanBeCalculated_2() throws IOException {
        assertEquals("com.paulhammant.svhttp.UtilityTests.testNameCanBeCalculated_2", delegateToTestNameForDepthTestingPurposes());
    }

    private String delegateToTestNameForDepthTestingPurposes() {
        return testName(1);
    }

}
