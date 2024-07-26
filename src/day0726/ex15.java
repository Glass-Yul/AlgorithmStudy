package day0726;

import java.util.Scanner;

public class ex15 {
    static void spira(int n) {
        // 피라미드
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) { // 빈공간 먼저 채우기
                System.out.print(" ");
            }
            for (int j = 0; j < (i - 1) * 2 + 1; j++) { // 그다음 별 찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n값 : ");
        int n = sc.nextInt();

        spira(n);
    }
}
