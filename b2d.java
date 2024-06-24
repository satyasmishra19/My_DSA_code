// pac5kage functions;

import java.util.Scanner;

public class b2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        binTodec(n);
    }
    public static void binTodec(int binNum) {
        int my_num = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0) {
            int lastdigit = binNum%10;
            decNum = decNum + (lastdigit * (int)Math.pow(2,pow));

            pow++;
            binNum /= 10 ;
        }

        System.out.println("decimal of " + my_num + " = " + decNum);
    }
}
