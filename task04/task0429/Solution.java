package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

 public class Solution {

     public static void main(String[] args) throws Exception {
         BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

         int[] list = new int[3];
         int countPlus = 0;
         int countMinus = 0;

         for (int i = 0; i < 3; i++) {
             list[i] = Integer.parseInt(read.readLine());
             if (list[i] > 0 && list[i] != 0) {
                 countPlus++;
             } else if (list[i] < 0 && list[i] != 0) {
                 countMinus++;
             }
         }
         System.out.println("количество отрицательных чисел: " + countMinus);
         System.out.println("количество положительных чисел: " + countPlus);

     }
 }