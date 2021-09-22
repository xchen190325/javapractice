package com.javapractice.codegym;



public class Solution0920 {
    public static void main(String[] args) {

        try {
            for (int i = 10; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(100);
            }

            }catch(InterruptedException e){
            //在此编写你的代码
                e.printStackTrace();
        }
    }
}


