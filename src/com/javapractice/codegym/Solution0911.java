package com.javapractice.codegym;
import java.util.Collection;
import java.util.HashMap;
public class Solution0911 {
    try{
        HashMap<String, String> map = new HashMap<String, String>(null);
        map.put(null, null);
        map.remove(null);
    }catch(NullPointerException e)
    {
        System.out.println("NullPointerException");
    }

}
