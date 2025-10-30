package Assignment11;

import java.util.Scanner;

public class DoreamoonAndWifi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int target = 0;
        for (char c : s1.toCharArray()) {
            if (c == '+')
                target++;
            else
                target--;
        }
        int cur = 0;
        int q = 0;
        for (char c : s2.toCharArray()) {
            if (c == '+')
                cur++;
            else if (c == '-')
                cur--;
            else
                q++;
        }
        int need = target - cur;
        double ans = 0.0;
        if (q == 0) {
            ans = (need == 0) ? 1.0 : 0.0;
            System.out.printf("%.12f\n", ans);
            return;
        }
        if (Math.abs(need) <= q && ((q + need) % 2 == 0)) {
            int r = (q + need) / 2;
            if (r >= 0 && r <= q) {
                long comb = 1;
                int k = Math.min(r, q - r);
                for (int i = 1; i <= k; i++) {
                    comb = comb * (q - k + i) / i;
                }
                double total = Math.pow(2, q);
                ans = comb / total;
            }
        }
        System.out.printf("%.12f\n", ans);
    }
}
