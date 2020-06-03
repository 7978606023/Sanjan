package com.wbl.stream;

import java.util.stream.Stream;

public class NumberStrem {
		public boolean isNumber(
		final Stream<Integer> numbers, final int num) {
		return numbers.anyMatch(i -> i == num);
		}
		}

