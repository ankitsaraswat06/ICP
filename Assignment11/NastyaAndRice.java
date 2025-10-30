package Assignment11;

import java.util.*;

public class NastyaAndRice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int f = 0;
            for (int i = a - b; i <= a + b; i++) {
                for (int j = c - d; j <= c + d; j++) {
                    if ((double) j / i == (double) n) {
                        f = 1;
                        break;
                    }
                }
            }
            if (f == 0)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
