package day0722;

public class ex1Max4 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if (b>max) max = b;
        if (c>max) max = c;
        if (d>max) max = d;
        return max;
    }
    static int min3(int a, int b, int c) {
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        return min;
    }
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if (b<min) min = b;
        if (c<min) min = c;
        if (d<min) min = d;
        return min;
    }

    public static void main(String[] args) {
        System.out.println("max4(11, 14, 30, 9): " + max4(11, 14, 30, 9));
        System.out.println("min3(19, 10, 3): " + min3(19, 10, 3));
        System.out.println("min4(20, 44, 1, 15): " + min4(20, 44, 1, 15));
    }
}
