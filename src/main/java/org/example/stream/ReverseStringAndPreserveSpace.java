package org.example.stream;

import java.util.Scanner;
//Try to understand this code and functionality
public class ReverseStringAndPreserveSpace {
    public static void main(String[] args) {
        //Reverse a sting with preserving the position of space : Eg :- "I Am Not String" , "g ni rtS toNmIA"
        //g ni rts tonmai
        //
       /* Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        String[] words = str.split(" ");
        Arrays.stream(words).map(w->new StringBuilder(w).reverse().toString())
                .forEach(System.out::println);*/
       // System.out.println(reversePreserveSpaces("I Am Not String"));
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        String reversed = reversePreserveSpaces(str);
        System.out.println("Reversed string with preserved spaces: " + reversed);
        sc.close();
    }
    public static String reversePreserveSpaces(String str) {
        char[] result = new char[str.length()];
        char[] chars = str.replace(" ", "").toCharArray();
        int j = chars.length - 1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result[i] = ' ';
            } else {
                result[i] = chars[j--];
            }
        }
        return new String(result);
    }
}
