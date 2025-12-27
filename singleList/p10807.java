package singleList;

import java.util.Scanner;

public class p10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int rep = 0; rep < n; rep++) arr[rep] = sc.nextInt();
        int count = 0;
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == target)
                count ++;
        }
        System.out.println(count);
    }
}
