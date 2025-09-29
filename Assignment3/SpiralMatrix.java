package Assignment3;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList();
        int total = matrix.length * matrix[0].length;
        int count =0;
        int minC = 0;
        int maxC = matrix[0].length - 1;
        int minR = 0;
        int maxR = matrix.length-1;


        while(count<total) {
            for(int i=minC; i<=maxC && count<total; i++) {
                list.add(matrix[minR][i]);
                count++;
            }
            minR++;
            for(int i=minR; i<=maxR && count<total; i++) {
                list.add(matrix[i][maxC]);
                count++;
                // maxC--;
            }
            maxC--;
            for(int i=maxC; i>=minC && count<total; i--) {
                list.add(matrix[maxR][i]);
                count++;
                // maxR--;
            }
            maxR--;

            for(int i=maxR; i>=minR && count<total; i--) {
                list.add(matrix[i][minC]);
                // minC++;
                count++;
            }
            minC++;

        }

        return list;
        
    }
    public static void main(String args[]) {
        int matrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralOrder(matrix));
    }
}
