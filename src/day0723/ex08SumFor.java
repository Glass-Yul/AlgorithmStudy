package day0723;

import java.util.Scanner;

public class ex08SumFor {
    static int of(int a, int b) {
        int max=0; int min=0; int sum = 0;

        if(a>b){
            max = a; min = b;
        }
        if(a<b){
            min = a; max = b;
        }

        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ex8 문제");
        System.out.print("a값 : ");
        int a = sc.nextInt();
        System.out.print("b값 : ");
        int b = sc.nextInt();

        int result = of(a, b);

        System.out.println("result = " + result);

    }
}
