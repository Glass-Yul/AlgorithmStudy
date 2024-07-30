package day0730;

import java.util.Scanner;

public class BaekJoon2743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str=null;
        do{
            str = sc.next();
            for (int i = 0; i < str.length(); i++) {
                if(i == str.length()-1) break;
                if(str.charAt(i)>='a'&&str.charAt(i)<='z'&&str.charAt(i)>='A'&&str.charAt(i)<='Z')
                    continue;

            }
        }while(str.isEmpty() || str.length() > 100);

        System.out.println(str.length());
        sc.close();
    }
}
