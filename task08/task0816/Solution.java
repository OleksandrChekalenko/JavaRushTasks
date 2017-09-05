package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        for (int i = 0; i < 8; i ++) {
            map.put("Stallone" + i, new Date("JUNE 1 1980"));
        }
        map.put("Stallone8", new Date("APRIL 1 1980"));
        map.put("Stallone9", new Date("MAY 1 1980"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        HashMap<String, Date> copy = new HashMap<>(map);
        for (Map.Entry<String, Date> pair : copy.entrySet()) {
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8 )
                map.remove(pair.getKey());
        }
        /*for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair);
        }*/
    }

    public static void main(String[] args) {
removeAllSummerPeople(createMap());
    }
}
