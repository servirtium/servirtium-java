package com.paulhammant.servirtium;

import com.github.underscore.lodash.U;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;

public class JsonAndXmlUtilities extends BaseMatcher<String> {

    private final static Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final JsonParser JSON_PARSER = new JsonParser();

    private final String expectedValue;

    public JsonAndXmlUtilities(String equalArg) {
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
        char firstNonBlankChar = doc.trim().charAt(0);
        if (firstNonBlankChar == '{') {
            try {
                return GSON.toJson(JSON_PARSER.parse(doc).getAsJsonObject());
            } catch (Exception e) {
            }
        }
        if (firstNonBlankChar == '[') {
            try {
                return GSON.toJson(JSON_PARSER.parse(doc).getAsJsonArray());
            } catch (Exception e) {
            }
        }
        if (firstNonBlankChar == '<') {
            try {
                return U.formatXml(doc);
            } catch (Exception e) {
            }
        }
        return doc;
    }

    @Factory
    public static Matcher<String> jsonEqualTo(String operand) {
        return new JsonAndXmlUtilities(operand);
    }
}
