package com.javapractice.codegym;

public class Solution0919 {

    public static void main(String[] args) {

        try{divideByZero();}
        catch (ArithmeticException e){
            e.getMessage();
            throw e;
        }
    }
    public static void divideByZero(){
        int a = 999/0;
        System.out.println("hello");
    }
}
