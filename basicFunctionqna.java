// package functions;

import java.util.*;
public class basicFunctionqna {
    public static  boolean primeno(int n){
        boolean isprime = true;
        for (int i = 2; i < Math.sqrt(n)+1; i++) {
                if (n % i == 0) {
                isprime = false;
            }
        }
        return isprime;
    }
    public static void primesinrange(int n) {
        // boolean isprime = true ;
        for (int i = 2; i <= n; i++) {
            if ( primeno(i) ) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
     }

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primesinrange(n);
    }
}
    
