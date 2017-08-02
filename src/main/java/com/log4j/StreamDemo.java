package com.log4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class StreamDemo {

	public static void main(String[] args) {
		// 去重复数值+数值大于4+升序排列后只返回前3个元素
		List<Integer> list = Arrays.asList(1, 2, 3, 3, 3, 4, 0, -11, 5, 6, 7,
				8, 9);

		print(list);

	}

	public static void print(List<Integer> list) {

		Iterator<Integer> iterator = list.iterator();
		List<Integer> ll = new ArrayList<Integer>();
		Set set = new HashSet();
		while (iterator.hasNext()) {
			Integer next = iterator.next();
			if (!(ll.contains(next)) && next > 4) {
				ll.add(next);
			}
		}
		Collections.sort(ll);
		int count = 0;
		for (Integer integer : ll) {
			count++;
			set.add(integer);
			if (count == 3) {
				break;
			}
		}
		System.out.println(set);

	}
}
