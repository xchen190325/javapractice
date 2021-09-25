package zh.codegym.task.task09.task0923;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
元音和辅音
*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // 在此编写你的代码

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        ArrayList<String> v = new ArrayList<>();
        ArrayList<String> n = new ArrayList<>();
        for(char c:input.toCharArray()){
            if(c != ' '){
                if(isVowel(c)){
                v.add(Character.toString(c));
            }else{
                n.add(Character.toString(c));
            }
            }

        }
        for(String s:v){
            System.out.print(s);
            System.out.print("  ");

        }
        System.out.println();
        for(String s:n){
            System.out.print(s);
            System.out.print(" ");

        }
    }

    // 该方法检查字母是否为元音
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // 转换为小写

        for (char d : vowels)   // 在数组中查找元音
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}