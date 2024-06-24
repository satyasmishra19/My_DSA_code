public class binarystringproblem {
    public static void bsprob(int n,int lastplace,String str) {
        if (n==0) {
            System.out.println(str);
            return;
        }

        bsprob(n-1,0,str+"0");

        if (lastplace==0) {
            bsprob(n-1,1,str+"1");
        }

    }
    public static void k(int n) {
        bsprob(n,0,"");
    }
    public static void main(String[] args) {
        k(3);
    }
}
