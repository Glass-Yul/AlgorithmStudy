package day0730;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BaekJoon5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[28];

        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            if (num < 1 || num > 30) { // 범위에 벗어나면
                break;
            }
            arr[i] = num;
        }

        for (int i = 1; i <= 30; i++) {
            if(!contains(arr, i))
                System.out.println(i);
        }
    }

    public static boolean contains(int[] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value)
                return true;
        }
        return false;
    }
}
