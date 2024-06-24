import java.util.*;

public class primernot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        for(int i=1 ;i<=(n);i++ ){
            if (n%i==0) {
                k=k+1;
            }
        }
        if (k>2) {
            System.out.println(n+" is a composite number");
        }
        else
            System.out.println(n+" is a prime number");
    }
}
