package day0722;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) {
            if(b>=c) return b;
            else if(a<=c) return a;
            else return c;
        } else if(a>c) return a;
        else if(b>c) return c;
        else return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수 중앙값 구하기");
        System.out.print("a : "); int a = sc.nextInt();
        System.out.print("b : "); int b = sc.nextInt();
        System.out.print("c : "); int c = sc.nextInt();

        System.out.println("\n중앙값 : "+med3(a,b,c));
    }
}
