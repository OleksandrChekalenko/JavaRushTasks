package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
если считать циклы FOR, то 3
1 FOR. создаем массив и сразу вычисляем максимум(IF)
2 FOR. вычисляем минимум(IF)
3 FOR кто первый (IF) и (IF)
и того 3 FOR снаружи и 4 IF внутри
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String max = "", min;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
            if (max.length() < list.get(i).length()) {
                max = list.get(i);
            }
        }
        min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (min.length() > list.get(i).length())
                min = list.get(i);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(max)){
                System.out.println(max);
                break;
            }
            if (list.get(i).equals(min)){
                System.out.println(min);
                break;
            }
        }


    }
}
