package com.test.stream;

import com.wbl.stream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FilterTest {

	
	private Filter filter = null;

		@BeforeTest
		public void setUP() {
		filter = new Filter();
		}
		@Test
		public void checkEven() {
				List<Integer> list = new ArrayList();
				list.add(1);
				list.add(2);
				list.add(1);
				list.add(2);
				list.add(2);
				List<Integer> actual = Filter.findOutEvenNum(list);
				List<Integer> expected = Arrays.asList(2,2,2);
				Assert.assertEquals(actual, expected);
		}
		@Test
		public void checkOdd() {
				List<Integer> list = new ArrayList();
				list.add(1);
				list.add(2);
				list.add(1);
				list.add(2);
				list.add(2);
				List<Integer> actual = Filter.findOutEvenNum(list);
				List<Integer> expected = Arrays.asList(1,1,1);
				Assert.assertEquals(actual, expected);
		}
		@Test
		public void checkZero() {
				List<Integer> list = new ArrayList();
				list.add(1);
				list.add(2);
				list.add(1);
				List<Integer> actual = Filter.findOutEvenNum(list);
				List<Integer> expected = Arrays.asList(0,0);
				Assert.assertEquals(actual, expected);
		}


}
