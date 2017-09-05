package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int days = Integer.parseInt(bufferedReader.readLine());
        String name = bufferedReader.readLine();

        System.out.println( name +" захватит мир через " + days + " лет. Му-ха-ха!");
    }
}
