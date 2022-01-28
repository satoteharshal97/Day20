package com.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    void checkMood() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String result = moodAnalyzer.checkSad("This is a sad message");
        Assertions.assertEquals("Happy",result);
    }

    @Test
    void checkFirstName() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkName("Harshal");
        Assertions.assertEquals(true, result);
    }

    @Test
    void checkLastName() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkName("Satote");
        Assertions.assertEquals(true, result);
    }

    @Test
    void checkMobileFormat() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkMobileFormat("91 8857829804");
        Assertions.assertEquals(true, result);
    }

    @Test
    void checkPassword() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        boolean result = moodAnalyzer.checkPassword("alphaA@123");
        Assertions.assertEquals(true, result);
    }
}
