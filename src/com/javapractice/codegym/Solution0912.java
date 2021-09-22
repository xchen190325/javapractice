package com.javapractice.codegym;

public class Solution0912 {

    try{
        int num = Integer.parseInt("XYZ");
        System.out.println(num);
    }catch(NumberFormatException e){
        System.out.println("NumberFormatException");
    }
}
