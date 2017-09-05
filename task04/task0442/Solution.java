package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int n;
        while (true){
            n = Integer.parseInt(bf.readLine());
            sum += n;
            if (n == -1) {
                System.out.println(sum);
                break;
            }

        }

    }
}
