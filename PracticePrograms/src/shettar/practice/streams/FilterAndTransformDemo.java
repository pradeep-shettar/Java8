package shettar.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterAndTransformDemo {

	public static void main(String[] args) {

		List<Integer> listEntries = Arrays.asList(1,2,3,4,5,6,7,8,9,0,2,5,8);
		
		Set<Integer> collect = listEntries.stream()
			.filter(value -> value < 9)
			.filter(value -> value > 3)
			.collect(Collectors.toList())
			.stream()
			.collect(Collectors.toSet());
		
		collect.forEach(System.out::println);
		
	}

}
