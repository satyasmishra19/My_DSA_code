public class RecursionBasics {
    public static void printDec(int n) {
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n) {
        if (n==1) {
            System.out.println(n);
            return;
        }
        printInc(n-1);
        System.out.println(n+" ");
    }
    public static int fact(int n) {
        if (n==0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n*fnm1;
        return fn ;
    }
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum1 = sum(n-1);
        int sn = n + sum1;
        return sn;
    }

    // calculate nth term in fibonacci
    public static int fib(int n) {
        if (n==0 || n==1) {
            return n;
        }
        int fnm1 = fib(n-1);
        int fnm2 = fib(n-2);
        int fn = fnm1 + fnm2;
        return fn;
    }
    public static boolean issorted(int arr[],int i) {
        if (i==arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return issorted(arr, i+1);
    }
    public static int firstoccurence(int arr[] , int key , int i) {
        if (i==arr.length) {
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
    public static int firsoccurence(int arr[] , int key ) {
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length) {
                return -1;
            }
            if (arr[i] == key) {
                return i;
            }
        }
        return firsoccurence(arr, key);
    }
    public static int lasoccurence(int arr[] , int key) {
        for (int i = arr.length-1; i > 0; i--) {
            if (i==0) {
                return -1;
            }
            if (arr[i] == key) {
                return i;
            }
        }
        return lasoccurence(arr, key);
    }
    public static int lastoccurence(int arr[] , int key ,int i) {
        if (i==arr.length) {
            return -1;
        }
        int isfound =lastoccurence(arr, key, i+1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(firsoccurence(arr, 5)); 
        System.out.println(lasoccurence(arr, 5)); 
    }
}
