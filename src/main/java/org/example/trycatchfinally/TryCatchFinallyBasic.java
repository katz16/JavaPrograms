package org.example.trycatchfinally;

public class TryCatchFinallyBasic {
    public static int m1(){
        try{
            return 1;
        }
        catch(Exception e){
            return 2;
        }
        finally{

            return 3;        }
    }

    public static void main(String[] args) {
        int result = m1();
        System.out.println("Result: " + result); // This will print "Result: 3"
    }
}
