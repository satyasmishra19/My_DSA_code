public class diagonal_sum {
    public static void main(String[] args) {
        int matrices[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        sum_diagonal(matrices);
    }
    public static void sum_diagonal(int matrices[][]) {
        int sum = 0;
        int s = 0;
        // time complexity of this code is 0(n^2)

        // for (int i = 0; i < matrices.length; i++) {
        //     for (int j = 0; j < matrices[0].length; j++) {
        //         if (i==j) {
        //             sum=sum+matrices[i][j];
        //         }
        //         else if (i+j == matrices.length-1) {
        //             sum=sum+matrices[i][j];
        //         }
        //     }
        // }
        // System.out.println(sum);

        for (int i = 0; i < matrices.length; i++) {
            // pd
            sum+=matrices[i][i];
            // sd
            if (i!=matrices.length-1-i) {
                sum+=matrices[i][matrices.length-i-1];
            }
        }
        System.out.println(sum);
    }
}
