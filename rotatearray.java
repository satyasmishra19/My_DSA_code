import java.util.Scanner;

public class rotatearray {
    public static void main(String[] args) {
      int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
      int n=matrix.length;
      for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(matrix[j][n-1-i]);;
        }
        System.out.println();
    }

    }
    public static void rotate2(int[][] matrix) {
        int n=matrix.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[j][n-1-i] = matrix[i][j];
            }
        }
    }
}