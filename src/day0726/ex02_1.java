package day0726;

import java.util.Random;

public class ex02_1 {
    static int maxOf(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(max < a[i])
                max = a[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();

        int[] height = new int[rand.nextInt(10)+1];

        for (int i = 0; i < height.length; i++) {
            height[i] = rand.nextInt(100)+50;
            System.out.println("height[" + i + "] = " + height[i]);
        }

        System.out.println("max 키 : "+maxOf(height));
    }
}
