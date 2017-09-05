package com.javarush.task.task08.task0818;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 8; i++) {
            map.put("dich" + i, 400 + i);
        }
        map.put("Kevin", 50000);
        map.put("Alex", 1500000);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry<String, Integer> par : copy.entrySet()) {
            if (par.getValue() < 500) {
                map.remove(par.getKey());
            }
        }
        /*for (Map.Entry<String, Integer> sout : map.entrySet()) {
            System.out.println(sout);
        }*/
    }

    public static void main(String[] args) {
    //removeItemFromMap(createMap());
    }
}