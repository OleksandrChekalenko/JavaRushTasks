package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
    return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //for (int i = set.size()-1; i < -1; i++) {
            set.removeIf(i -> i > 10);
        //}
        return set;
    }

    public static void main(String[] args) {
        //System.out.println(removeAllNumbersMoreThan10(createSet()));
    }
}
