package day0723;

import java.util.Scanner;

public class SumWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 n까지 합");
        System.out.print("n값 : ");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;

        while(i <= n){
            sum += i;
            ++i;
        }
        System.out.println("n까지의 합 : "+sum);
    }
}
