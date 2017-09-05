package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.*;

/* 
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> tmp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            list.add(sc.nextInt());
        }
        int count = 1;
        int max = 1;
        for (int i=0; i<list.size()-1;i++)
        {
            if (list.get(i) == list.get(i + 1))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);
    }
}
/*
public class Solution {
    public static void main(String[] args) throws IOException {
        int count = 0, countCount = 0;

        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i) == arrayList.get(j))
                    count++;
                }
            if (countCount < count)
                countCount = count;
        }
        System.out.println(countCount - 1);
    }
}*/
