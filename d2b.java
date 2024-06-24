// package functions;

import java.util.Scanner;

public class d2b {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bintodec = sc.nextInt();
        System.out.println(decTobin(bintodec));

     }
     public static int decTobin(int n) {
        int pow = 0;
        int binnum = 0;
        while (n>0) {
            int rem = n%2;
            binnum += rem*Math.pow(10,pow);
            pow++;
            n /= 2;
        }
        return binnum;
     }
}
