package com.google.refine.tests.sorting;

import org.json.JSONObject;
import org.testng.annotations.Test;

import com.google.refine.sorting.Criterion;
import com.google.refine.tests.util.TestUtils;

public class NumberCriterionTest {
    @Test
    public void serializeNumberCriterion() {
        String json = 
                "        {\n" + 
                "          \"errorPosition\": 2,\n" + 
                "          \"valueType\": \"number\",\n" + 
                "          \"column\": \"start_year\",\n" + 
                "          \"blankPosition\": 1,\n" + 
                "          \"reverse\": true\n" + 
                "        }\n";
        TestUtils.isSerializedTo(Criterion.reconstruct(new JSONObject(json)), json);
    }
}
