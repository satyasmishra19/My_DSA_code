public class tillingproblem {
    public static int tillingpro(int n) {
        //base case
        if (n==0 || n==1) {
            return 1;
        }
        //kaam
        //vertical choice
        int fnm1 = tillingpro(n-1);

        //horizontal choice
        int fnm2 = tillingpro(n-2);

        int totWays = fnm1 + fnm2 ;
        return totWays;
    }
    public static void main(String[] args) {
        System.out.println(tillingpro(4));
    }
}
