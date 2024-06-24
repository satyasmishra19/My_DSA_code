import java.util.*;

public class bitMANUPULATION {
    
    public static void oddeven(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            System.out.println("the no. is even number");
        }
        else{
            System.out.println("the no. is odd number");
        }        
    }
    public static int getIthbit(int n,int i){
        int bitmask = 1<<i;
        if ((n & bitmask) == 0) {
            return 0 ;
            }else{
                return 1;
            }
     }
     public static int setIthbit(int n,int i) {
        int bitMask = 1<<i;
        return n| bitMask;
     }
     public static int clearIthbit(int n , int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
     }
    public static int updateIthbit(int n , int i,int newbit) {
        n= clearIthbit(n,i);
        int bitmask = newbit<<i;
        return n|bitmask;
    }
    public static int clearBits(int n , int i) {
        int bitMask = (~0)<<i;
        return n&bitMask;
    }
    public static int clearBitsinrange(int n, int i,int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }
    public static boolean ispoweroftwo(int n) {
        return (n&(n-1)) == 0;
    }
    public static int countsetbits(int n) {
        int count = 0;
        while (n>0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static int fastexpo(int a,int n) {
        int ans = 1;

        while (n>0) {
            if ((n & 1) != 0) {
                ans *= a;

            }
            a*=a;
            n>>=1;

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        // int j = sc.nextInt();
        // int newbit = sc.nextInt();
        // oddoeven(n);
        // oddeven(4);
        System.out.println(fastexpo(a, i));
    }
}
