package Assignment5;

import java.util.Arrays;

public class MinimumBurstBalloons {
    public static int find(int[][] points) {
        Arrays.sort(points, (a,b)->Integer.compare(a[1], b[1]));
        long end = points[0][1];
        long arrows = 1;
        for(int i=1; i<points.length; i++) {
            if(points[i][0] > end) {
                end = points[i][1];
                arrows++;
            }
        }
        return (int)arrows;
    }
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(find(points));
    }
}
