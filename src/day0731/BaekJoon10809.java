package day0731;

import java.util.Scanner;

public class BaekJoon10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        if(!distinction(str)) return; // a~z 포함 안되면 끝냄

        for (int i = 'a'; i <= 'z'; i++) {
            int position = -1;
            for (int j = 0; j < str.length(); j++) {
                if (i == str.charAt(j)) {
                    position = j; // 해당 인덱스
                    break;
                }
            }
            System.out.print(position + " ");
        }

    }

    public static boolean distinction(String str){
        int i;
        for (i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                continue;
            else
                break;
        }
        return i == str.length();
    }
}
