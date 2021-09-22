package com.javapractice.codegym;

public class Solution0913 {
        public static void main(String[] args) throws Exception {
        try{
            method1();
        }catch(NullPointerException e){
            System.out.println("NullPointerException");
        }catch(FileNotFoundException e){
            System.out.println("FileNotFoundException");
        }



        //在此编写你的代码
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
        int i = (int) (Math.random() * 4);
        if (i == 0) {
            throw new NullPointerException();
        }
        if (i == 1) {
            throw new ArithmeticException();
        }
        if (i == 2) {
            throw new FileNotFoundException();
        }
        if (i == 3) {
            throw new URISyntaxException("", "");
        }
    }
}
