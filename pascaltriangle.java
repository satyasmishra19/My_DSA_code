import java.util.Scanner;

public class pascaltriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int r = sc.nextInt();
        // int row = sc.nextInt();
        // System.out.println(NcR(n, r));
        pascaltri(n);
    }
    public static long NcR(int n,int r) {
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
    public static void rowofpascal(int n) {
        for (int i = 0; i <= n ; i++) {
            System.out.print(NcR(n, i)+" ");
        }
    }
    public static void pascaltri(int n) {
        for (int j = 0; j <= n; j++) {
            for (int i = 0; i <= j ; i++) {
                System.out.print(NcR(j, i)+" ");
            }
            System.out.println();
        }
    }
}
