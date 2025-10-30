package Assignment11;

import java.util.Scanner;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long t = sc.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextLong();
        int l = 0, r = 0, ans = 0;
        long sum = 0;
        while (r < n) {
            sum += a[r];
            while (sum > t)
                sum -= a[l++];
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        System.out.println(ans);
    }
}
