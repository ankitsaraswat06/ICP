package Assignment11;

import java.util.Scanner;

public class RecursiveQueries {
    static int f(int x) {
        int res = 1;
        while (x > 0) {
            int d = x % 10;
            if (d != 0)
                res *= d;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int MAX = 1000000;
        int[] g = new int[MAX + 1];
        for (int i = 1; i <= 9; i++)
            g[i] = i;
        for (int i = 10; i <= MAX; i++)
            g[i] = g[f(i)];
        int[][] pref = new int[10][MAX + 1];
        for (int k = 1; k <= 9; k++) {
            for (int i = 1; i <= MAX; i++) {
                pref[k][i] = pref[k][i - 1] + (g[i] == k ? 1 : 0);
            }
        }
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (q-- > 0) {
            int l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
            sb.append(pref[k][r] - pref[k][l - 1]).append("\n");
        }
        System.out.print(sb);
    }
}
