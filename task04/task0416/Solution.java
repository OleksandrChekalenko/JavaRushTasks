package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        Double time = Double.parseDouble(bfr.readLine());
        if (time % 5 >= 0 && time % 5 < 3) System.out.println("зелёный");
        if (time % 5 >= 3 && time % 5 < 4) System.out.println("желтый");
        if (time % 5 >= 4 && time % 5 < 5) System.out.println("красный");
    }
}