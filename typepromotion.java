import java.util.*;

public class typepromotion {

    public static void main(String[] args) {

        // 1st type
        // char a = 'a' ;
        // char b = 'b' ;
        // // char c = a-b ;
        // System.out.println((int)(b));
        // System.out.println((int)(a));
        // System.out.println(b-a);


        // // 2nd type
        // short a = 5;
        // byte b = 2;
        // char c = 'c';
        // byte bt = (byte)(a+b+c);
        // System.out.println(bt);
        // // System.out.println(a+b+c);

        // // 3rd type
        // int a = 10;
        // float b = 20.25f;
        // long c = 25;
        // // double d = 30;
        // double ans = a+b+c;
        // System.out.println(ans);

        // 4th type
        byte b= 5;
        byte a= (byte)(b*5);
        // byte a= b*5;     /wrong process
        System.out.println(a);
    }
}