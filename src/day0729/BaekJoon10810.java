package day0729;

import java.util.Scanner;

public class BaekJoon10810 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt(); // 배열(바구니) 크기
        m = sc.nextInt(); // 공 넣을 횟수

        int[] arr = new int[n]; // 바구니 생성
        int i, j, k;

        for (int num = 0; num < m; num++) {
            i = sc.nextInt(); // 바구니 시작 범위
            j = sc.nextInt(); // 바구니 마지막 범위
            k = sc.nextInt(); // 넣을 공 숫자

            for (int x = i; x <= j; x++) {
                arr[x-1] = k;
            }
        }

        for (int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
