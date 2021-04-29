package com.example.android.yodha;

import android.app.Instrumentation;
import android.content.Context;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runner.Runner;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.yodha", appContext.getPackageName());
    }

    private static class InstrumentationRegistry {
        public static Instrumentation getInstrumentation() {
            return null;
        };
    }

}