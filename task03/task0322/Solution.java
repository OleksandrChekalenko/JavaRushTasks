package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine(), name1 = bufferedReader.readLine(), name2 = bufferedReader.readLine();
        System.out.println(name + " + " + name1 + " + " + name2 + " = Чистая любовь, да-да!");
    }
}