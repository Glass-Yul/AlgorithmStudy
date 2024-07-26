package day0723;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("양의 정수를 입력하시오");
        do {
            n = sc.nextInt();
        } while (n <= 0);

        String str = String.valueOf(Integer.toString(n).length());
        System.out.println("그 수 자릿수는 "+str+"자리 입니다.");
    }
}
