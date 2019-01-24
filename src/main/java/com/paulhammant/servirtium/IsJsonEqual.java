package com.paulhammant.servirtium;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

public class IsJsonEqual extends BaseMatcher<String> {

    private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final JsonParser JSON_PARSER = new JsonParser();

    private final String expectedValue;

    public IsJsonEqual(String equalArg) {
        expectedValue = prettifyJson(equalArg);
    }

    @Override
    public boolean matches(Object actualValue) {
        if (actualValue == null) {
            return expectedValue == null;
        }

        String actual = prettifyJson((String) actualValue);
        final boolean equals = actual.equals(expectedValue);
        return equals;
    }

    @Override
    public void describeTo(Description description) {
        description.appendValue(expectedValue);
    }

    public static String prettifyJson(String doc) {
        try {
            return GSON.toJson(JSON_PARSER.parse(doc).getAsJsonObject());
        } catch (Exception e) {
            try {
                return GSON.toJson(JSON_PARSER.parse(doc).getAsJsonArray());
            } catch (Exception e2) {
                throw new AssertionError("GSON didn't think that was JSON");
            }
        }
    }

    public static String prettifyDocOrNot(String doc) {
        try {
            return GSON.toJson(JSON_PARSER.parse(doc).getAsJsonObject());
        } catch (Exception e) {
            try {
                return GSON.toJson(JSON_PARSER.parse(doc).getAsJsonArray());
            } catch (Exception e2) {
                return doc;
            }
        }
    }

    @Factory
    public static Matcher<String> jsonEqualTo(String operand) {
        return new IsJsonEqual(operand);
    }
}
