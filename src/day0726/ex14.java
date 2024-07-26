package day0726;

import java.util.Scanner;

public class ex14 {
    static void triangleLB(int n) {
        // 왼쪽 아래가 직각인 이등변삼각형
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleLU(int n) {
        // 왼쪽 위가 직각인 이등변삼각형
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRU(int n) {
        // 오른쪽 위가 직각인 이등변삼각형
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) { // 공백 먼저 채운 후
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) { // 별찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }static void triangleRB(int n) {
        // 오른쪽 아래가 직각인 이등변삼각형
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n-i; j++) { // 공백 먼저 채운 후
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) { // 별찍기
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n값 : ");
        int n = sc.nextInt();

//        triangleLB(n);
//        triangleLU(n);
//        triangleRU(n);
        triangleRB(n);
    }
}
