package com.paulhammant.servirtium;

import org.junit.Test;

import java.io.IOException;

import static com.paulhammant.servirtium.ServirtiumServer.testName;
import static org.junit.Assert.assertEquals;

public class UtilityTests {

    @Test
    public void testNameCanBeCalculated() throws IOException {
        assertEquals("com.paulhammant.servirtium.UtilityTests.testNameCanBeCalculated", testName());
    }

    @Test
    public void testNameCanBeCalculated_2() throws IOException {
        assertEquals("com.paulhammant.servirtium.UtilityTests.testNameCanBeCalculated_2", delegateToTestNameForDepthTestingPurposes());
    }

    private String delegateToTestNameForDepthTestingPurposes() {
        return testName(1);
    }

}
