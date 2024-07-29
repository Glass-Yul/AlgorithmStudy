package day0729;

import java.util.Scanner;

public class BaekJoon10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt(); // 배열(바구니) 크기
        m = sc.nextInt(); // 공 넣을 횟수

        int[] arr = new int[n]; // 바구니 생성
        int i, j;

        for(int x=0;x<arr.length;x++)
            arr[x] = x+1; // 값 초기화

        for (int num = 0; num < m; num++) {
            i = sc.nextInt()-1; // 바꿀 자리
            j = sc.nextInt()-1; // 바꿀 자리

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

        for (int x = 0; x < n; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}
