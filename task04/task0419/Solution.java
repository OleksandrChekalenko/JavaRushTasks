package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

/*
public class Solution {

    public static int maxOfTwo(int a, int b){
        if ( a > b )
        return a;
        if (b > a)
            return b;
        else return a;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());
        int b = Integer.parseInt(bufferedReader.readLine());
        int c = Integer.parseInt(bufferedReader.readLine());
        int d = Integer.parseInt(bufferedReader.readLine());
//        int a = 1, b = 2, c = 3, d = 4;

        if (maxOfTwo(a,b) > maxOfTwo(c,d)) System.out.println(maxOfTwo(a,b));
        if (maxOfTwo(a,b) < maxOfTwo(c,d)) System.out.println(maxOfTwo(c,d));
        else System.out.println(maxOfTwo(a,b));
    }
}
*/
public class Solution {
    public static int returnMax(int a,int b){
        return a > b ? a : b;
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        System.out.println(returnMax(a,b) > returnMax(c,d) ? returnMax(a,b) : returnMax(c,d));
    }
}
