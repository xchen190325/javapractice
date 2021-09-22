package com.javapractice.codegym;

import java.io.IOException;

public class Solution0918 {

    public static void main(String[] args) {
    }

    static class MyException extends IOException {
    }

    static class MyException2 extends MyException{
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends MyException3{
    }
}


