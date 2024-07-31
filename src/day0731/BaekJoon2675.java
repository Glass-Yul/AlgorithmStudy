package day0731;

import java.util.Scanner;

public class BaekJoon2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(num<1 || num>1000) return;

        String[] arr = new String[num];
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            if(n<1 || n>8) return;

            arr[i] = sc.next();
            for (int k = 0; k < arr[i].length(); k++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i].charAt(k));
                }
            }
            System.out.println();
        }

    }
}
