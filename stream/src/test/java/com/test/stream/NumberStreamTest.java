package com.test.stream;

import static org.testng.Assert.assertEquals;

import java.util.stream.Stream;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wbl.stream.NumberStrem;

public class NumberStreamTest {
		private NumberStrem isNumberPresentStream = null;
		@BeforeTest
		public void setUp() {
			isNumberPresentStream = new NumberStrem();
		}
		@Test
		public void positive() {
			Stream<Integer> stream = Stream.of(1, 2, 3, 4);
			int num = 4;
			assertEquals(isNumberPresentStream.isNumber(stream, num), true);
		}
		
		@Test
		public void negetive() {
			Stream<Integer> stream = Stream.of(-1, -3, -2, -4);
			int num = 4;
			assertEquals(isNumberPresentStream.isNumber(stream, num), false);
		}
		
		@Test
		public void PositiveNegetive() {
			Stream<Integer> stream = Stream.of(1, 2, -3, -4);
			int num = 4;
			assertEquals(isNumberPresentStream.isNumber(stream, num), true);
		}
		
		@Test
		public void zero() {
			Stream<Integer> stream = Stream.of(0, 0);
			int num = 4;
			assertEquals(isNumberPresentStream.isNumber(stream, num), false);
		}
		
		@Test
		public void duplicateNum() {
			Stream<Integer> stream = Stream.of(1, 1, 2, 2);
			int num = 4;
			assertEquals(isNumberPresentStream.isNumber(stream, num), false);
		}
		
		@Test
		public void Null() {
			Stream<Integer> stream = Stream.of();
			int num = 0;
			assertEquals(isNumberPresentStream.isNumber(stream, num), false);
		}
}
