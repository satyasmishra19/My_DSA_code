import java.util.*;
public class basicsarray {
    // public static void main(String[] args) {
    //     int mark[] = new int[100];

    //     Scanner sc = new Scanner(System.in);

    //     mark[0] = sc.nextInt();
    //     mark[1] = sc.nextInt();
    //     mark[2] = sc.nextInt();
    //     mark[3] = sc.nextInt();

    //     mark[3] += 5;

    //     System.out.println("phy marks = "+ mark[0]);
    //     System.out.println("chem marks = "+ mark[1]);
    //     System.out.println("bio marks = "+ mark[2]);
    //     System.out.println("math marks = "+ mark[3]);


    //     System.out.println("Array length = "+ mark.length);
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int
        int mark[] = {99,97,98};
        int nonchangable = 5;
        Update(mark , nonchangable);
        System.out.println(nonchangable);
        for (int i = 0; i < mark.length; i++) {
            System.out.print(mark[i]+"  ");
        }
    }
    public static void Update(int mark[] , int nonchangable) {
        nonchangable = 10;
        for (int i = 0; i < mark.length; i++) {
            mark[i] += 1;
        }
    }
}