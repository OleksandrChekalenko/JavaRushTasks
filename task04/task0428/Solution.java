package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        int count = 0;
        for (int i = 0; i < 3; i++) {a[i] = Integer.parseInt(r.readLine());}
        for (int i : a) {if (i > 0) {count++;}
        }
        System.out.println(count);

    }
}
