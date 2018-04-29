package shettar.practice.functions;

import java.util.Arrays;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		BiFunction<String, String, String> concat = (a, b) -> a + b;
		for (String name : Arrays.asList("John", "Johnny")) {
			System.out.println(concat.apply("Hello ", name));
		}

		BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;
		for (Integer number : Arrays.asList(20, 30)) {
			System.out.println(sum.apply(number, 1));
		}
	}

}
