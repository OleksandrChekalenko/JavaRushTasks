package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        int[] littleArray1 = new int[10];
        int[] littleArray2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(in.readLine());
            if (i <= 9) littleArray1[i] = array[i];
            else if (i > 9) {
                littleArray2[i - 10] = array[i];
                System.out.println(littleArray2[i - 10]);
            }
        }
    }
}
