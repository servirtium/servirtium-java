package com.paulhammant.servirtium;

import org.junit.Test;

import static com.paulhammant.servirtium.IsJsonEqual.jsonEqualTo;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.*;

public class IsJsonEqualTest {

    @Test
    public void testJsonEqualTo() {

        String json = "{ \"a\": 123}";

        assertThat(json, jsonEqualTo("{\"a\":\n\n 123   }   "));
        assertThat(json, not(jsonEqualTo("{\"a\":\n\n 2384728374927349827349   }   ")));

    }
}