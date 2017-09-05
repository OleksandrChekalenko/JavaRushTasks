package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int cash = Integer.parseInt(bufferedReader.readLine()), year = Integer.parseInt(bufferedReader.readLine());


        System.out.println( name + " получает " + cash + " через " + year + " лет.");
    }
}
