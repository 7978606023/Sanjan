package com.wbl.stream;

import java.util.List;
import java.util.stream.Collectors;
/* 
 */
public class DemoMethod {
		/**
		 * @param strings string
		 * @return value
		 */
		public List<String> refernce(final List<String> strings) {
		List<String> sorted = strings
		.stream()
		.sorted((s1, s2) -> s1.compareTo(s2))
		.collect(Collectors.toList());
		return sorted;
		}
	}