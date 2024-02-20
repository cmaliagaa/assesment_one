package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomStringUtilsTest {

    private CustomStringUtils customStringUtils = new CustomStringUtils();


    @Test
    void testRemoveDuplicatesWithAStringWithDuplicates() {
        String testString = "AABBBCCD112233";
        String expectedString = "ABCD123";
        String result = customStringUtils.removeDuplicates(testString);
        assertEquals(expectedString, result);
    }

    @Test
    void testRemoveDuplicatesWithAStringWithNoDuplicates() {
        String testString = "ABCD";
        String expectedString = "ABCD";
        String result = customStringUtils.removeDuplicates(testString);
        assertEquals(expectedString, result);
    }

    @Test
    void testRemoveDuplicatesWithAnEmptyString() {
        String testString = "";
        String expectedString = "";
        String result = customStringUtils.removeDuplicates(testString);
        assertEquals(expectedString, result);
    }

    @Test
    void testRemoveDuplicatesWithAnStringWithNumbers() {
        String testString = "11221231231";
        String expectedString = "123";
        String result = customStringUtils.removeDuplicates(testString);
        assertEquals(expectedString, result);
    }

    @Test
    void testRemoveDuplicatesWithAnStringWithLettersNumbersAnsSymbols() {
        String testString = "CCLLAuDDDiiOO###1";
        String expectedString = "CLAuDiO#1";
        String result = customStringUtils.removeDuplicates(testString);
        assertEquals(expectedString, result);
    }

}