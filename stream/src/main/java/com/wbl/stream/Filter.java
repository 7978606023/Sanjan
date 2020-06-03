package com.wbl.stream;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
public static List<Integer> findOutEvenNum(final List<Integer> num) {
List<Integer> list = num.stream()
.filter(i -> i % 2 == 0)
.collect(Collectors.toList());
return list;
}

}

