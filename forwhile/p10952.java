package forwhile;

import java.util.Scanner;

public class p10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while (a != 0){
            int b = sc.nextInt();
            int c = a+b;
            System.out.println(c);
            a = sc.nextInt();
        }
    }
}
