package com.javapractice.codegym;

public class Solution {
    public static void main(String[] args) {
        handleExceptions(new Solution());
    }

    public static void handleExceptions(Solution obj) {
        try{
            obj.method1();
            obj.method2();
            obj.method3();
        }catch(NullPointerException e){
            e.printStackTrace();
            printStack(e);

        }catch(IndexOutOfBoundsException e){
            e.printStackTrace();
            printStack(e);
        }catch(NumberFormatException e){
            e.printStackTrace();
            printStack(e);
        }catch(Exception e){
            e.printStackTrace();
            printStack(e);
        }

    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}
