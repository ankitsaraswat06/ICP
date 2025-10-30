package Assignment11;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryStringMinimizing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            char[] s = sc.next().toCharArray();
            int zeros = 0;
            StringBuilder ans = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (s[i] == '0') {
                    long moves = Math.min(k, i - zeros);
                    ans.setLength(zeros);
                    k -= moves;
                    zeros++;
                }
            }
            char[] res = new char[n];
            Arrays.fill(res, '1');
            int pos = 0;
            for (int i = 0; i < n && zeros > 0; i++) {
                if (i <= k) {
                    res[i] = '0';
                    zeros--;
                } else
                    break;
            }
            System.out.println(new String(res));
        }
    }
}
