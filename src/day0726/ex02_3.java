package day0726;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex02_3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length ; i++) {
            sum += a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(50) + 1;
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int result = sumOf(a);
        System.out.println("배열 합의 결과 : " + result);
    }
}
