package Assignment11;

import java.math.BigInteger;
import java.util.Scanner;

public class LunarNewYear {
    static final long MOD = 998244353;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        long[] b = new long[k];
        for (int i = 0; i < k; i++)
            b[i] = sc.nextLong();
        long n = sc.nextLong();
        long m = sc.nextLong();
        if (n - k > 1000) {
            System.out.println(-1);
            return;
        }
        for (long fk = 1; fk < MOD; fk++) {
            long[] f = new long[(int) (n + 1)];
            for (int i = 1; i < k; i++)
                f[i] = 1;
            f[k] = fk;
            for (int i = k + 1; i <= n; i++) {
                BigInteger prod = BigInteger.ONE;
                for (int j = 1; j <= k; j++) {
                    prod = prod.multiply(BigInteger.valueOf(b[j - 1]))
                            .multiply(BigInteger.valueOf(f[i - j]))
                            .mod(BigInteger.valueOf(MOD));
                }
                f[i] = prod.longValue();
            }
            if (f[(int) n] == m) {
                System.out.println(fk);
                return;
            }
        }
        System.out.println(-1);
    }
}
