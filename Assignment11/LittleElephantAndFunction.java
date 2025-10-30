package Assignment11;

import java.util.Scanner;

public class LittleElephantAndFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println(1);
            return;
        }
        System.out.print(n + " ");
        for (int i = 1; i < n; i++) {
            System.out.print(i + (i == n - 1 ? "\n" : " "));
        }
    }
}
