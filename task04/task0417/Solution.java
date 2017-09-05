package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bfr.readLine());
        int b = Integer.parseInt(bfr.readLine());
        int c = Integer.parseInt(bfr.readLine());
        if (a == b && b == c) System.out.print(a + " " + b + " " + c);
        else {
            if (a == b) System.out.print(a + " " + b);
            if (a == c) System.out.print(a + " " + c);
            if (c == b) System.out.print(c + " " + b);
        }
    }
}