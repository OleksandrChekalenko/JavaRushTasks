package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num>0 && num<1000){
            if (num%2==0) System.out.println("четное ");
            else System.out.println("нечетное ");
            if (num<10) System.out.println("однозначное число");
            else if (num<100) System.out.println("двузначное число");
            else System.out.println("трехзначное число");
        }

    }
}