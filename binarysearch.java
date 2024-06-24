import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        int number[] = {2,4,6,8,10};
        // reverse(number);
        // for (int i = 0; i < number.length; i++) {
        //     System.out.print(number[i]+"  ");
        // }
        // System.out.println();
        subarray(number);
    }
    public static void reverse(int number[]) {
        int first =0 , last = number.length-1;

        while (first<last) {
            int temp = number[last];
            number[last] = number[first];
            number[first] = temp;


            first++;
            last--;
            
        }
    }
    public static int binarySearch(int number[],int key) {
        int start = 0 , end = number.length-1;
        while (start<=end) {
            int mid = (start+end)/2;

            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                start = mid+1;
            }else{
                end = mid-1;
            }
            
        }
        return -1;
    }

    public static void pair_in_Array(int number[]) {
        for (int j = 0; j < number.length; j++) {
            int k = number[j];
            for (int i = j+1; i < number.length; i++) {
                int m = number[i];
                System.out.print("("+k+","+m+")");
            }
            System.out.println();   
        }
    }
    public static void subarray(int number[]) {
        int ts = 0;
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(number[k]+" ");
                    sum+=number[k];
                }
                ts++;
                System.out.println();
                System.out.println("the sum of an array is "+sum);
            }
            System.out.println();
        }
        System.out.println("Total subarray are = "+ts);

    }
}
