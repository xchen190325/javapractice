package com.javapractice.codegym;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.Exception.*;
/*
try-catch 中的方法
*/

public class Solution0921 {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //在此编写你的代码
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        try {
            while (true) {
                int input = sc.nextInt();
                arrayList.add(input);
            }

        } catch (NumberFormatException e) {
            e.printStackTrace();
            for (int i : arrayList) {
            System.out.println(i);
        }
        }catch (Exception e) {
            e.printStackTrace();
        }


    }
}
