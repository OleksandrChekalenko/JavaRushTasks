package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int s;

        if (n1>=n2 && n1<=n3 || n1<=n2 && n1>=n3){
            s=n1;
            System.out.println(s);}
        else if (n2>=n1 && n2<=n3 || n2<=n1 && n2>=n3) {
            s = n2;
            System.out.println(s);}
        else if (n3 >= n1 && n3 <= n2 || n3 <= n1 && n3 >= n2) {
            s = n3;
            System.out.println(s);}

    }
}
