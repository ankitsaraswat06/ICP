package Assignment1;

import java.util.Arrays;

public class minimumNumberOfArraysToBurstBalloons {
    public static int find(int[][] points) {
        Arrays.sort(points, (a, b)-> Integer.compare(a[1], b[1]));
        int end = points[0][1];
        int c = 1;
        for(int i=1; i<points.length; i++) {
            if(points[i][0] > end) {
                end = points[i][1];
                c++;
            }
        }
        return c;
    }
    public static void main(String args[]) {
        int arr[][] = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(find(arr));
    }
}
