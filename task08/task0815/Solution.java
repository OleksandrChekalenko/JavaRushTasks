package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<String, String>();
        for(int i = 0;i < 10;i++){
            map.put("фамилия" + i, "имя"+i);
        }
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countName = 0;
        for(Map.Entry<String, String> mapN : map.entrySet()){
            if(mapN.getValue().equals(name)){
                countName++;
            }

        }
        return countName;


    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int countLastName = 0;
        for(Map.Entry<String, String> mapL : map.entrySet()){
            if(mapL.getKey().equals(lastName)){
                countLastName++;
            }
        }
        return countLastName;
    }

    public static void main(String[] args) {

    }
}