package com.lambda.demo;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		//number.forEach(e->System.out.println(e));
		number.forEach(System.out::println);
	}
}
