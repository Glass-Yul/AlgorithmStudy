package day0726;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ex02_2 {
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1]; // 맨 마지막 요소값에서 i 증가값 빼기
            a[a.length - i - 1] = temp;

            System.out.println(Arrays.toString(a));
            System.out.println("a["+i+"]와 a["+(a.length-i-1)+"]을 교환합니다.");
        }

    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(100) + 1;
        }

        reverse(a);

    }
}
