package org.example.recursion;

public class RecursionBasic {
    public static void main(String[] args) {
        fun(3);
    }
    public static void fun(int n){
        if(n==0)
            return;
        fun(n/2);
        System.out.println(n%2);
    }
}
