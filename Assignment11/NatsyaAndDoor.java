import java.util.*;

public class NatsyaAndDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            int[] peak = new int[n + 1];
            for (int i = 2; i < n; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    peak[i] = 1;
                }
            }

            int[] pref = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + peak[i];
            }
            int bestCnt = -1;
            int bestL = 1;

            for (int l = 1; l <= n - k + 1; l++) {
                int r = l + k - 1;
                int cnt = pref[r - 1] - pref[l];
                if (cnt > bestCnt) {
                    bestCnt = cnt;
                    bestL = l;
                }
            }

            System.out.println((bestCnt + 1) + " " + bestL);
        }
        sc.close();
    }
}