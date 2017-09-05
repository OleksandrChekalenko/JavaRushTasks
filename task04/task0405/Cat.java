package com.javarush.task.task04.task0405;

/* 
Реализовать метод setCatsCount
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        Cat.catsCount = catsCount;//напишите тут ваш код

    }

    public static void main(String[] args) {
    setCatsCount(3);
//        System.out.println(Cat.catsCount);
    }
}
