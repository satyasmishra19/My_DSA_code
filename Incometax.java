import java.util.*;
public class Incometax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        double tax = 0;
        if (income<500000) {
            tax = 0.05;
        }
        else if ((500000<income) && (income<1000000)) {
            tax = 0.2;
        }
        else {
            tax = 0.3;
        }
        double paytax = income * tax;
        paytax = income- paytax;
        System.out.println(paytax);
    }
}