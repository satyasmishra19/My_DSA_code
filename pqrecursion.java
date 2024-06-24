

public class pqrecursion {
    public static void  occurrences(int[] arr ,int i,int key) {
        if (arr[i] == key) {
            System.out.println(i);
        }
        if (i==arr.length - 1) {
            return;
        }
        occurrences(arr, i+1, 2);
    }

    public static void numToAphabet(int num,int i) {
        int bb = num/i;
        int power = 0;
        power++;
        if(bb<0){
            return;
        }
        numToAphabet(num,i*10);
        System.out.println(power);
    }
    

    public static void toh(int n,int A,int C,int B) {
        if (n==0) {
            return;
        }
        toh(n-1, A, B, C);
        System.out.println("Moving "+n+"th disk from "+A+"to"+C);
        toh(n-1, B, C, A);
    }  

    public static void main(String[] args) {
        // int[] arr = {3,2,4,5,6,7,2,2};
        // occurrences(arr, 0, 2);

        // int num = 1975;
        // int i = 10;
        // numToAphabet(1975, 10);

        toh(3, 1, 3, 2);
    }
}
