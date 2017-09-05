package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент — с новой строки.*/

public class Solution {

    public static void main(String[] args) throws Exception {
        String[] strArray = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 8; i++) {
            strArray[i] = reader.readLine();
        }
        for (int i = strArray.length - 1; i >= 0; i--) {
            System.out.println(strArray[i]);
        }
    }
}