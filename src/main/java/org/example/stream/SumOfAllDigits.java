package org.example.stream;

public class SumOfAllDigits {
    public static void main(String[] args) {
        int val=15623;
        String s= String.valueOf(val);
        char[]c=s.toCharArray();
        int sum=0;
        for(char ch:c){
            sum=sum+Integer.parseInt(String.valueOf(ch));
        }
        System.out.println("sum of the digits is "+sum);
    }
}
