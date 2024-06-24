import java.util.*;

public class forloop {

    public static void main(String[] args) {
        // print the reverse of the number
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // while (a>0) {
        //     int ld = a%10;
        //     a = a/10;
        //     System.out.print(ld);
        // }


        // reverse the given number
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int rev = 0;
        while (a>0) {
            int ld = a%10;
            a = a/10;
            rev = (rev*10)+ld;
        }
        System.out.println(rev);
    }
}
// ram pari raja nahi