package day0726;

import java.util.Arrays;
import java.util.Random;

public class ex02_4 {
    // 요소 복사
    static void copy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("요소 복사");
        System.out.println("a배열 : "+Arrays.toString(a));
        System.out.println("b배열 : "+Arrays.toString(b));
    }

    // 요소 역순 복사
    static void recopy(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
            b[b.length - 1 - i] = a[i];
        }
        System.out.println("요소 역순 복사");
        System.out.println("a배열 : "+Arrays.toString(a));
        System.out.println("b배열 : "+Arrays.toString(b));
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = rand.nextInt(50)+1;
        }
        int[] b = new int[a.length];

        copy(a, b);
        recopy(a, b);

    }
}
