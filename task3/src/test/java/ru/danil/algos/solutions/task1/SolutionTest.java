package ru.danil.algos.solutions.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void test1() {
        var testMap = StringAnalyzer.analyze("Hello, World! How are you today?");

        assertEquals(6, testMap.get("Words"));
        assertEquals(3, testMap.get("Punctuation"));
        assertEquals(14, testMap.get("Consonants"));
        assertEquals(10, testMap.get("Vowels"));
        assertEquals(5, testMap.get("Spaces"));
        assertEquals(24, testMap.get("Letters"));
    }
    @Test
    public void test2() {
        var testMap = StringAnalyzer.analyze("Привет, мир! Как дела?..");

        assertEquals(4, testMap.get("Words"));
        assertEquals(5, testMap.get("Punctuation"));
        assertEquals(10, testMap.get("Consonants"));
        assertEquals(6, testMap.get("Vowels"));
        assertEquals(3, testMap.get("Spaces"));
        assertEquals(16, testMap.get("Letters"));
    }
    @Test
    public void test3() {
        var testMap = StringAnalyzer.analyze("Java 17 & Python 3.10 - топ!");

        assertEquals(3, testMap.get("Words"));
        assertEquals(3, testMap.get("Punctuation"));
        assertEquals(9, testMap.get("Consonants"));
        assertEquals(4, testMap.get("Vowels"));
        assertEquals(6, testMap.get("Spaces"));
        assertEquals(13, testMap.get("Letters"));
    }

    @Test
    public void test4() {
        var testMap = StringAnalyzer.analyze("ThisIsATestWithoutPunctuation");
//        System.out.println(StringAnalyzer.analyze("..., !? ;:"));
        assertEquals(1, testMap.get("Words"));
        assertNull(testMap.get("Punctuation"));
        assertEquals(17, testMap.get("Consonants"));
        assertEquals(12, testMap.get("Vowels"));
        assertNull(testMap.get("Spaces"));
        assertEquals(29, testMap.get("Letters"));
    }

    @Test
    public void test5() {
        var testMap = StringAnalyzer.analyze("..., !? ;:");

        assertEquals(0, testMap.get("Words"));
        assertEquals(8, testMap.get("Punctuation"));
        assertNull(testMap.get("Consonants"));
        assertNull(testMap.get("Vowels"));
        assertEquals(2, testMap.get("Spaces"));
        assertNull(testMap.get("Letters"));
    }

    @Test
    public void test6() {
        var testMap = StringAnalyzer.analyze("Я хочу как-то это протестить. По-моему должно работать +- норм");

        assertEquals(8, testMap.get("Words"));
        assertEquals(4, testMap.get("Punctuation"));
        assertEquals(28, testMap.get("Consonants"));
        assertEquals(20, testMap.get("Vowels"));
        assertEquals(9, testMap.get("Spaces"));
        assertEquals(48, testMap.get("Letters"));
    }
}
