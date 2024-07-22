package day0722;

import java.util.Scanner;

public class Max3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구하시오.");
        System.out.println("a : "); int a = sc.nextInt();
        System.out.println("b : "); int b = sc.nextInt();
        System.out.println("c : "); int c = sc.nextInt();

        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("최댓값은 "+max);

    }
}
