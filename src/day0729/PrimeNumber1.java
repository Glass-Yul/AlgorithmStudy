package day0729;

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0;

        for (int n = 2; n <= 13; n++) {
            int i;
            for (i = 2; i < n; i++) {
                counter++;
                if (n == i) {
                    System.out.println(n);
                }
            }
            System.out.println("나눗셈을 수행한 횟수 : "+counter);
        }
    }
}
