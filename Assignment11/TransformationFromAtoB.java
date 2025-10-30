package Assignment11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TransformationFromAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        List<Long> seq = new ArrayList<>();
        while (b > a) {
            seq.add(b);
            if (b % 10 == 1)
                b /= 10;
            else if (b % 2 == 0)
                b /= 2;
            else
                break;
        }
        if (b != a)
            System.out.println("NO");
        else {
            System.out.println("YES");
            Collections.reverse(seq);
            seq.add(0, a);
            System.out.println(seq.size());
            for (long x : seq)
                System.out.print(x + " ");
        }
    }
}
