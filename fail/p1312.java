package fail;

import java.util.Scanner;

public class p1312 {
    public static int cal(int a, int b, int n){
        int c = 0;
        for (int i = 0; i < n; i++) {
            c = a % b;
            System.out.println(c);
            cal(c, b, n-1);
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(cal(a, b, n));
    }
}
