package Assignment5;

import java.util.Arrays;
import java.util.Comparator;

public class NonOverlapping {
    public static int erase(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparing(o -> o[1]));
        int non = 1;
        int time = intervals[0][1];
        for(int i=1; i<intervals.length; i++) {
            if(intervals[i][0]>=time) {
                non++;
                time = intervals[i][1];
            }
        }
        return intervals.length - non;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(erase(intervals));

    }
}
