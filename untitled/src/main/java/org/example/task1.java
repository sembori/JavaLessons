package org.example;
import java.util.Random;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {
            Random random = new Random();
            int i = random.nextInt(2001);
            System.out.println("Случайное число:" + i);
            int n = Integer.toBinaryString(i).length();
        System.out.println("Значение старшего бита:" + n);

        short count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if ( j % n == 0) {
                count++;
            }
        }
        int[] m1 = new int [count];
        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++){
            if (j % n == 0) {
                m1[count++] = j;
            }
        }
        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if ( j % n != 0) {
                count++;
            }
        }
        int[] m2 = new int [count];

        count = 0;
        for (int j = Short.MIN_VALUE; j < i; j++){
            if (j % n != 0) {
                m2[count++] = j;
            }
        }

    }
}


