package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*1. Создай массив целых чисел (int[]) на 20 элементов.
2. Считай с клавиатуры 20 целых чисел и добавь их в массив.
3. Найди и выведи через пробел максимальное и минимальное числа.
4. Используй цикл for.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        maximum = arr[19];
        minimum = arr[19];
        for (int i = 0; i < arr.length; i++) {
            if (maximum <= arr[i]) {
                maximum = arr[i];
            }
            if (minimum >= arr[i])
                minimum = arr[i];
        }

        System.out.print(maximum + " ");
        System.out.println(minimum);
    }
}
