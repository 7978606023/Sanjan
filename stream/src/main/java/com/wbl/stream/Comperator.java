package com.wbl.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comperator {

	public static void main(final String[] args) {
		int[] input = {1, 3, 4, 5};
		Compare.sorting(input);
		}
		public static  List<Integer> sorting(final int[] input) {
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		for (int i:input) {
		arraylist.add(i);
		}
		Comparator<Integer> com = (i1, i2) -> i2.compareTo(i1);
		List<Integer> list = arraylist.stream().sorted(com)
		.collect(Collectors.toList());
		return list;
		}
}
