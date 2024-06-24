// package functions;
import java.util.*;

import java.util.Scanner;

public class basicFunction {
   public static void printHelloworld() {
    System.out.println("HELLO WORLD");
    System.out.println("HELLO WORLD");
    System.out.println("HELLO WORLD");
    System.out.println("HELLO WORLD");
   } 
   public static int calculate_sum(int a, int b) {
      int sum = a+b;
      return sum;
      // System.out.println("sum is "+sum);
   }
   public static int multiply(int a, int b) {
      int product = a*b;
      return product;
   }
   // public static void main(String[] args) {
   //    Scanner sc = new Scanner(System.in);
   //    int a = sc.nextInt();
   //    int b = sc.nextInt();
   //    int prod = multiply(a, b);
   // //  calculate_sum(a,b);
   //    System.out.println("multiplication is "+ prod);  
   //    int sa = multiply(6, 8);
   //    System.out.println(sa);
   // }

   public static int factorial(int a) {
      int prod=1;
      for (int i = a; i > 0; i--) {
         prod = multiply(prod, i);
         if (i==1) {
            System.out.print(i);
            break;
         }
         System.out.print(i+"*");
      }
      // int prod = multiply(a, b);
   //  calculate_sum(a,b);
      System.out.println("="+prod);
      return prod;
   }
   public static int bino(int n , int r) {
      Scanner sc = new Scanner(System.in);
      int fact_n = sc.nextInt();
      fact_n =  factorial(n);
      int fact_r = sc.nextInt();
      fact_r = factorial(r);
      int fact_nmr = factorial(n-r);
      

      int bincof = fact_n/(fact_r*fact_r);
      return bincof;
    }
   public static void main(String[] args) {
      System.out.println(bino(4,7));
   }
}
