import java.util.*;

public class ternary {
    public static void main(String[] args) {
        // 1st program
        // int larger= (5<3) ? 5 : 3;
        // System.out.println(larger);

        // pass or fail
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        String result = (mark>=33) ? "pass" : "fail";
        System.out.println(result);

    }    
}
