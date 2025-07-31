package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindLargest {

	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(40,55,758,10,30,77,73);
		//Find the maximum element in this list
		int max=al.stream().max(Comparator.comparing(Function.identity())).get();
		System.out.println(max);
		
		//Find the 3rd largest number
		int thirdmax=al.stream().sorted(Comparator.reverseOrder()).skip(2).max(Comparator.comparing(Function.identity())).get();
		System.out.println(thirdmax);

	}

}
