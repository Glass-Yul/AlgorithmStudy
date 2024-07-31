package day0731;

import java.util.Scanner;

public class BaekJoon1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().trim(); // 앞뒤 공백 자름

        if (str.isEmpty()) {
            System.out.println(0);
        } else{
            String[] arr = str.split(" ");
            System.out.println(arr.length);

        }
    }
}
