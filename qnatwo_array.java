// package two_D_array;

public class qnatwo_array {
    public static int sum(int matrix[][],int key) {
        int row = key ;
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            sum+=matrix[row][i];
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},
                          {11,4,3},
                          {2,2,3}};                 
        sumofsecondrow(matrix);
    }
    public static void transpose(int matrix[][]) {
        int i= matrix.length, j =matrix[0].length ;

        for (int j2 = 0; j2 < j; j2++) {
            for (int k = 0; k < i; k++) {
                System.out.print(matrix[k][j2]+"  ");
            }
            System.out.println();
        }
    }
    public static void sumofsecondrow(int matrix[][]) {
        int sum=0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum+=matrix[1][i];
        }
        System.out.println(sum);
    }
}

