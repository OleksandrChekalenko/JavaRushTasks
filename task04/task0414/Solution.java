package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        if ((year % 400) == 0 || (year % 4) == 0 &&
                (year % 100) != 0) {
            System.out.println("количество дней в году: 366");
        }
        else System.out.println("количество дней в году: 365");
    }
}