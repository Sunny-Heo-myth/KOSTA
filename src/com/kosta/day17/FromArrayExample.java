package com.kosta.day17;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FromArrayExample {

	public static void main(String[] args) {
		
		String[] strArray = {"hong", "shin", "joon"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(a -> System.out.println(a + ", "));
		
		System.out.println();
		
		int[] intArray = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(n -> System.out.println(n));
		System.out.println();

	}

}
