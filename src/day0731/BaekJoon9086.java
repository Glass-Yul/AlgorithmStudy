package day0731;

import java.util.Scanner;

public class BaekJoon9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String[] arr = new String[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < arr.length; i++) {
            //String.valueOf() => 문자 더하기라는 걸 인식해줌
            System.out.println(String.valueOf(arr[i].charAt(0))+arr[i].charAt(arr[i].length()-1));
        }
    }
}
