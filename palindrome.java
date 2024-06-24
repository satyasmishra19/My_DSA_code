// package functions;

import java.util.Scanner; 

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a== pd(a)) {
            System.out.println("this ia a palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }

    }
    public static int pd( int a) {
       int i = a % 10;
       int b= 0;
       while (a!=0) {
        b = b+(a%10);
        b *= 10;
        a /= 10;
       }
       return b/10;
    }
}
