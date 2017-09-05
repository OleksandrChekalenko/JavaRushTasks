package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();// Считать строки с консоли и объявить ArrayList list тут
        for (int i = 0; i < 10; i++){
            list.add(reader.readLine());
        }
        ArrayList<String> result = doubleValues(list);

        for (String res : result) {
            System.out.println(res);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        for (int i = list.size() - 1; i > -1; i--) {
            list.add(i, list.get(i));
        }//напишите тут ваш код
        return list;
    }
}
