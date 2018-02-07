package shettar.practice.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FirstAndLastEntryRetrieval {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
		System.out.println("Simple way!");
		System.out.println(numbers.get(0));
		System.out.println(numbers.get(numbers.size() - 1));

		System.out.println("Java 8");
		Function<List<Integer>, List<Integer>> getFirstAndLast = result -> Arrays.asList(numbers.get(0),
				numbers.get(numbers.size() - 1));
		
		List<Integer> ultimateList = getFirstAndLast.apply(numbers);
		ultimateList.forEach(System.out::println);
	}

}
