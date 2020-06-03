package com.wbl.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapExample {	
		public static List<Integer>multiplyNum(final List<Integer> num) {
		List<Integer> list = num.stream()
				.map(i -> i * i).collect(Collectors.toList());
		return list;

		}
}
