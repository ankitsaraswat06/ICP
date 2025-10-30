package Assignment11;

import java.util.Scanner;

public class VasyaAndString {
    static int solve(String s, int k, char c) {
        int l = 0, max = 0, count = 0;
        for (int r = 0; r < s.length(); r++) {
            if (s.charAt(r) != c)
                count++;
            while (count > k) {
                if (s.charAt(l) != c)
                    count--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String s = sc.next();
        System.out.println(Math.max(solve(s, k, 'a'), solve(s, k, 'b')));
    }
}
