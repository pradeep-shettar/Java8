package shettar.practice.functions;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		Consumer<String> display = data -> System.out.println(data.toUpperCase());
		display.accept("Hello Consumer");
	}

}
