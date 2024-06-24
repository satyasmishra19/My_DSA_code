// import java.util.*;
public class week3live {
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b= temp;
    }
    public static void swap2(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1]= temp;
    }
    public static int binarysearch(int[] arr, int searchvalue) {
        int n = arr.length;

        int si = 0;
        int ei = n-1;

        while (si <= ei) {
            int mid = (si+ei)/2;

            if (arr[mid] == searchvalue) {
                return mid ;
            }
            else if(arr[mid] < searchvalue){
                si = mid + 1;
            }else{
                si = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {10,15,17,19,21,31};
        
        int searchvalue = 31;

        System.out.println(binarysearch(arr,searchvalue));
    }
}
