// package two_D_array;

public class sortedmatrix{
    public static boolean staircasesearch(int matrix[][],int key) {
        int row =0 , col = matrix[0].length-1;

        while (row<matrix.length && col>=0){
            if (matrix[row][col] == key){
                System.out.println("found key st ("+(row+1)+","+(col+1)+")");
                return true;
            }else if (matrix[row][col]>key){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args){
        int matrix[][] = {{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,38,39,50}};
        int key = -5;  
        staircasesearch(matrix,key);          
    }    
}
