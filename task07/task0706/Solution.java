package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
1. Создать массив на 15 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Пускай индекс элемента массива является номером дома, а значение — число жителей, проживающих в доме.
Дома с нечетными номерами расположены на одной стороне улицы, с четными — на другой. Выяснить, на какой стороне улицы проживает больше жителей.
4. Вывеси на экран сообщение: «В домах с нечетными номерами проживает больше жителей.» или «В домах с четными номерами проживает больше жителей.»


*/

public class Solution {
    public static void main(String[] args) throws Exception {
//напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in) );
        int[] list = new int[15];

        for (int i = 0; i < list.length; i++)
        {
            list[i]=Integer.parseInt(reader.readLine());
        }
        int n1=0;
        for (int i = 0; i < list.length; i=i+2)
        {
            int n2=list[i];
            n1=n1+n2;
        }
        int p1=0;
        for (int i = 1; i < list.length; i=i+2)
        {
            int p2=list[i];
            p1=p1+p2;
        }

        if (n1 > p1)
            System.out.println("В домах с четными номерами проживает больше жителей.");
        else if (n1 < p1)
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
    }
}