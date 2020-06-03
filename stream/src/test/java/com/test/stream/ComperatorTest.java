package com.test.stream;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.stream.Comperator;

public class ComperatorTest {


@Test
public void positive() {
int[] input = {1, 3, 4, 5};
List<Integer> actual = Comperator.sorting(input);
List<Integer> expected = Arrays.asList(5, 4, 3, 1);
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void negitive() {
int[] input = {-4, -1, -9, -5};
List<Integer> actual = Comperator.sorting(input);
List<Integer> expected = Arrays.asList(-1, -4, -5, -9);
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void positiveNegetive() {
int[] input = {-2, -5, 8, 9};
List<Integer> actual = Comperator.sorting(input);
List<Integer> expected = Arrays.asList(9, 8, -2, -5);
Assert.assertEquals(actual, expected);
}
/**
*/
@Test
public void numbers() {
int[] input = {1, 3, 4, 5, 0, -2, -3};
List<Integer> actual = Comperator.sorting(input);
List<Integer> expected = Arrays.asList(5, 4, 3, 1, 0, -2, -3);
Assert.assertEquals(actual, expected);
}
@Test
public void zero() {
int[] input = {0, 0, 0};
List<Integer> actual = Comperator.sorting(input);
List<Integer> expected = Arrays.asList(0,0,0);
Assert.assertEquals(actual, expected);
}

}
