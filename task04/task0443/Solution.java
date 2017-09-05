package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int y = Integer.parseInt(bf.readLine()), m = Integer.parseInt(bf.readLine()), d = Integer.parseInt(bf.readLine());

        System.out.println("Меня зовут " + name + ".\n" +
                "Я родился " + d + "." + m + "." + y );
    }
}
