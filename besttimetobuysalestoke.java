import java.util.*;
public class besttimetobuysalestoke {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(buyandsalestokes(prices));
    }
    public static int buyandsalestokes(int prices[]) {
        int minprice = prices[0];
        int profit[] = new int[prices.length];
        profit[0] = 0;
        int k = 0 ;
        for (int i = 1; i < prices.length; i++) {
            minprice = Math.min(prices[i], minprice);
            profit[i] = prices[i] - minprice;
            k = Math.max(Math.max(profit[i], profit[i-1]), k) ;
        }
        return k ;
    }
}
