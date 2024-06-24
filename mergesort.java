// package sorting;

public class mergesort {
    public static void merge(int[] arr,int start,int mid, int end) {
        // start pointer at first array
        int p1 = start;
        // start pointer at second array
        int p2 = mid+1;
        int size= end-start+1;
        int[] narr = new int[size];
        int i = 0 ;
        while (p1<=mid && p2<=end) {
            if (arr[p1]<arr[p2]) {
                narr[i]=arr[p1];
                i++;
                p1++;
            }
            else{
                narr[i] = arr[p2];
                i++;
                p2++;
            }
        }
        while (p1<=mid) {
            narr[i]=arr[p1];
            i++;
            p1++;
        }
        while (p2<=end) {
            narr[i]=arr[p2];
            i++;
            p2++;
        }
        for (int j = 0; j < size; j++) {
            arr[start+j] = narr[j];
        }
    }
    public static void divide(int[] arr,int start ,int end) {
        if (start == end) {
            return;
        }
        int mid = (start+end)/2;
        // divide array into two parts
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        merge(arr,start,mid,end);
    }
    public static void main(String[] args) {
        int[] arr = {7,6,2,1,9,5,4,3,8};
        divide(arr,0,8);
        int n=9;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            // System.out.println(" ");
        }

    }
}
