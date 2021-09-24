package com.javapractice.codegym;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
今天是几号？
*/

public class Solution0922 {

    public static void main(String[] args) throws Exception {
        //在此编写你的代码


        Scanner sc = new Scanner(System.in);
        String d = sc.nextLine();
        Date dt = new SimpleDateFormat("yyyy-MM-dd").parse(d);
        SimpleDateFormat sd = new SimpleDateFormat("MMM dd, yyyy");
        String g = sd.format(dt).toUpperCase(Locale.ROOT);
        System.out.println(g);

    }
}
