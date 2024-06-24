public class power_x_n {
    public static void main(String[] args) {
        int a = 2;
        int n =5;
        System.out.println(optimisedpower(a, n));
    }
    public static int optimisedpower(int a, int n) {
        if (n==0) {
            return 1;
        }
        int halfpowers = optimisedpower(a, n/2);
        int halfpower = halfpowers*halfpowers;

        if (n%2 != 0) {
            halfpower = a * halfpower;
        }
        return halfpower;
    }
}
