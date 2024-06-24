public class friendspairing {
    public static int fndpair(int n) {
        int sum =1;
        if (n==1 || n==2) {
            return n;
        }
        else{
            if(n!=3){
                sum = n*fndpair(n-1);
            }else{
                sum = n*fndpair(n-2);
            }
        }
        return sum;
    }
    public static int fndpairoptimised(int n) {
        if (n==1||n==2) {
            return n;
        }
        // int s= fndpairoptimised(n-1);
        // int k = fndpairoptimised(n-2);
        // int p = (n-1)*k;
        
        // int totways = s + p;
        return fndpairoptimised(n-1) + (n-1)*fndpairoptimised(n-2) ;
    }
    public static void main(String[] args) {
        System.out.println(fndpairoptimised(3));
    }
}
