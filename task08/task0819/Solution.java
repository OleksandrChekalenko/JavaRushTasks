package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
1. Внутри класса Solution создать public static класс кот – Cat.
2. Реализовать метод createCats, он должен создавать множество (Set) котов и добавлять в него 3 кота.
3. В методе main удалите одного кота из Set cats.
4. Реализовать метод printCats, он должен вывести на экран всех котов, которые остались во множестве.
Каждый кот с новой строки.
Требования:
1. Программа должна выводить текст на экран.
2. Внутри класса Solution должен быть public static класс Cat.
3. Метод createCats() класса Solution должен возвращать множество (Set) содержащее 3 кота.
4. Метод printCats() класса Solution должен вывести на экран всех котов из множества. Каждый кот с новой строки.
5. Метод main() должен вызывать метод createCats().
6. Метод main() должен вызывать метод printCats().*/
public class Solution {
    public static class Cat{

    }
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        /*Set<Cat> copy =new HashSet<>(cats);
        int count = 0;
        cats.clear();
        for (Cat c : copy) {
            if (count == 2)
                break;
            cats.add(c);
            count++;
        }*/
        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat());
        cats.add(new Cat());
        cats.add(new Cat());
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c : cats) {
            System.out.println(c);
        }
    }

    // step 1 - пункт 1
}
