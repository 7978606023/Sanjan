package com.test.stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.wbl.stream.Compare;

public class CompareTest {

	public class ComparatorTest {
		@Test
		public void positive() {
		int[] k = {2, 3, 4, 1};
		Integer actual = Compare.sorting(k);
		Integer expected = 4;
		Assert.assertEquals(actual, expected);
		}
		@Test
		public void negitive() {
		int[] k = {-1, -2, -4, -5};
		Integer actual = Compare.sorting(k);
		Integer expected = -1;
		Assert.assertEquals(actual, expected);
		}
		@Test
		public void positiveNegetive() {
		int[] k = {-2, -3, 4, 6};
		Integer actual = Compare.sorting(k);
		Integer expected = 6;
		Assert.assertEquals(actual, expected);
		}
		@Test
		public void negetiveZero() {
		int[] k = {-2, -3, -4, 0};
		Integer actual = Compare.sorting(k);
		Integer expected = 0;
		Assert.assertEquals(actual, expected);
		}
		@Test
		public void Zero() {
		int[] k = {0, 0, 0, 0};
		Integer actual = Compare.sorting(k);
		Integer expected = 0;
		Assert.assertEquals(actual, expected);
		}
		
	}
}
