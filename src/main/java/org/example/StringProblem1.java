package org.example;

public class StringProblem1 {

	public static void main(String[] args) {
		if("Hello!"=="Hello!"){
			System.out.println("Same strings.");
			}
		String str= new String("Hello!");
		if(str=="Hello!"){
			System.out.println("Different strings.");
			}
		if(str.equals("Hello!")){
			System.out.println("the strings are equal.");
			}

	}

}
