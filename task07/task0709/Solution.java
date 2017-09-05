package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String shortest;
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        shortest = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() <= shortest.length()) {
                shortest = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == shortest.length()) {
                System.out.println(list.get(i));
            }
        }
    }
}
