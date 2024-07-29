package day0729;

public class PrimeNumber2 {
    public static void main(String[] args) {
        int count = 0;
        int ptr = 0;
        int[] prime = new int[500];
        
        // ptr은 0부터 ++됨
        prime[ptr++] = 2; // 2는 소수임

        for (int n = 3; n <= 1000; n += 2) { // 홀수로 증가
            int i;
            for (i = 1; i < ptr; i++) { // 현재 존재하는 배열까지
                count++;
                if(n % prime[i] == 0) // n이 배열 안에 있는 숫자로 나눠지면
                    break; // 합성수이므로 종료
            }
            if (ptr == i) { // 배열 크기만큼 해도 나눠 떨어지지 않으면
                prime[ptr++] = n; // 소수이므로 n값 저장
            }
        }

        for (int i = 0; i < ptr; i++) {
            System.out.println(prime[i]);
        }

        System.out.println("나눗셈을 수행한 횟수 : " + count);
    }
}
