package com.test.stream;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;

import org.testng.annotations.Test;

import com.wbl.stream.StringLowerCase;

public class StringLowerCaseTest {


    @Test
    public void noLowercaseLettersInAnEmptyString() {
        assertEquals(0, StringLowerCase.countLowercaseLetters(""));
    }

    @Test
    public void countsLowercaseLetterExample() {
        assertEquals(3, StringLowerCase.countLowercaseLetters("aBcDeF"));
    }

    @Test
    public void suppoertsNoLowercaseLetters() {
        assertEquals(0, StringLowerCase.countLowercaseLetters("ABCDEF"));
    }

    @Test
    public void noStringReturnedForEmptyList() {
        assertFalse(StringLowerCase.mostLowercaseString(Collections.<String>emptyList()).isPresent());
    }

    @Test
    public void findsMostLowercaseString() {
        Optional<String> result = StringLowerCase.mostLowercaseString(Arrays.asList("a", "abc", "ABCde"));
        assertEquals(Optional.of("abc"), result);
    }
}
