import java.util.*;
public class qnaloop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 1st star pattern question
        // int p = 1;
        // int q = n-1;
        // int no_of_line = 1;
        // while (no_of_line<=n) {
        //     for (int j = 0; j<p;j++ ) {
        //         System.out.print("* ");
        //     }
        //     for (int j = 0 ; j < q ; j++){
        //         System.out.print("  ");
        //     }
        //     System.out.println();
        //     p++;
        //     q--;
        //     no_of_line++;    
        // }
        // 2nd star pattern question
        // int p = 1;
        // int q = n-1;
        // int no_of_line = 1;
        // while (no_of_line<=n) {
        //     for (int j = q; j>0;j-- ) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 0 ; j < p ; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        //     p++;
        //     q--;
        //     no_of_line++;    
        // }
        // 3rd question
        // int p = 1;
        // int q = n-2;
        // int no_of_line = 1;
        // while (no_of_line<=n-1) {
        //     if (no_of_line == 1 || no_of_line == n-1) {
        //         for (int i = 0; i < n; i++) {
        //             System.out.print("* ");
        //         }
        //     }
        //     else{
        //         for (int i = 0; i <= n; i++) {
        //             if (i== 0 || i==n-1) {
        //                 System.out.print("* ");
        //             }
        //             else{
        //                 System.out.print("  ");
        //             }
        //         }
        //     } 
        //     System.out.println();
        //     no_of_line++;
        // }

        // 4th question
        // int p = 1;
        // int q = n-1;
        // int no_of_line = 1;
        // while (no_of_line<=2*n-1) {
        //     // print space
        //     for (int i = 0 ; i < q; i++) {
        //         System.out.print("  ");
        //     }
        //     // print star
        //     for (int i = 0; i < p; i++) {
        //         System.out.print("* ");
        //     }
        //     // print space
        //     for (int i = q ; i > 0; i--) {
        //         System.out.print("  ");
        //     }
        //     System.out.println();
        //     if (no_of_line<n) {
        //         p=p+2;
        //         q--;   
        //     }else{
        //         p=p-2;
        //         q++;
        //     }
        //     no_of_line++;
        // }

        // 5th question
        // int p = 1;
        // int q = n-1;
        // int no_of_line = 1;
        // while (no_of_line<=n) {
        //     // print space
        //     for (int i = 0; i < q; i++) {
        //         System.out.print("  ");
        //     }
        //     // print star
        //     for (int i = p; i <= n  ; i++) {
        //         if (i==1 || i==n){
        //             for (int j = 0; j < n; j++) {
        //                 System.out.print("* ");
        //             }   
        //         }
        //         else{
        //             for (int j = 1; j <= n; j++) {
        //                 if (j==1 || j==n) {
        //                     System.out.print("* ");
        //                 }
        //                 else{
        //                     System.out.print("  ");
        //                 }
        //             }
        //         }
        //     break;


        //     }
        //     System.out.println(); 
        //     p++;
        //     q--;
        //     no_of_line++;
                  
        // }

        // 6th question number pyramid pattern
        // int p = 1;
        // int q = n-1;
        // int no_of_line = 1;
        // while (no_of_line<=n) {
        //     for (int j = q; j>0;j-- ) {
        //         System.out.print("  ");
        //     }
        //     for (int j = 0 ; j < p ; j++){
        //         System.out.print(no_of_line+"   ");
        //     }
        //     System.out.println();
        //     p++;
        //     q--;
        //     no_of_line++;    
        // }

        // 7th question of star pattern in pallindrome pattern
        int p = 1;
        int q = n-1;
        int no_of_line = 1;
        while (no_of_line<=n) {
            for (int j = q; j>0;j-- ) {
                System.out.print("  ");
            }
            int currnt_num = no_of_line;
            for (int j = 0 ; j < p ; j++){
                System.out.print(currnt_num+" ");
                if (j < p/2) {
                    currnt_num--;
                }else{
                    currnt_num++;
                }
            }
            System.out.println();
            p=p+2;
            q--;
            no_of_line++;    
        }
    }
}
