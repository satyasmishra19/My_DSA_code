import java.util.*;
public class one2ten {

    public static void main(String[] args) {
        // 1st program
        // int count = 1 ;
        // while (count <= 10) {
        //     System.out.println(count);
        //     count++;
        // }


        // 2nd one
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = 1;
        // while (b<=a) {
        //     System.out.println(b);
        //     b++;
        // }


        // 3rd one
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 1;
        int sum = 0;
        while (b<=a) {
            sum = sum + b;
            b++;
        }
        System.out.println(sum);
    }
}