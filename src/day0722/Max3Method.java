package day0722;

public class Max3Method {
    static int max(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("max3(3,2,1) = " + max(3,2,1));
        System.out.println("max(3,2,2) = " + max(3,2,2));
        System.out.println("max(1,2,3) = " + max(1,2,3));
        System.out.println("max(2,2,2) = " + max(2,2,2));
    }
}
