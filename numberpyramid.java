import java.util.*;

public class numberpyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        _0_1_triangle(a);
    }
    public static void number_pyramid(int a) {
        for (int nextline = 1; nextline <= a; nextline++) {
            // print spaces
            for (int i = 1; i <= (a-nextline); i++) {
                System.out.print("  ");
            }
            // print number
            for (int i = 1; i <= nextline; i++) {
                System.out.print(nextline+"   ");
            }
            // print space
            // for (int i = 1; i < (a-nextline); i++) {
            //     System.out.print("  ");
            // }
            System.out.println();
        }
    }
    public static void inverted_half_pyramid(int a) {
        // print line
        for (int next_line = 1; next_line <= a; next_line++) {
            // print numbers
            for (int i = 1; i <= (a-next_line+1); i++) {
                System.out.print(i+"  ");
            }
            System.out.println();
        }
    }
    public static void FLOYD_triangle(int a) {
        int j = 1;
        for (int next_line = 1; next_line <= a; next_line++) {
            // print numbers
            for (int i = 1; i <= next_line; i++) {
                    System.out.print(j+" ");
                    j+=1;
            }
            System.out.println();
        }
    }
    public static void _0_1_triangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < i+1; j++) {
                int c = i+j ;
                if (c%2==0) {
                    System.out.print("1  ");
                }else{
                    System.out.print("0  ");
                }
            }
            System.out.println();
        }
    }
}
