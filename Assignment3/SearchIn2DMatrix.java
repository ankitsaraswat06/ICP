package Assignment3;

public class SearchIn2DMatrix {
    public static boolean search(int[][] matrix, int target) {
       int row = 0;
       int col = matrix[0].length-1;
       while(row<matrix.length && col >= 0) {
        if(matrix[row][col] == target) return true;
        if(matrix[row][col] > target) col--;
        else row++;
       }
       return false;
    }
    public static void main(String args[]) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(search(matrix, target));
    }
}
