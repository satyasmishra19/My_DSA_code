import java.util.*;
public class qna {
    public static void main(String[] args) {
        // int arr[] = {1,1,1,3,3,4,3,2,4,2};
        // System.out.println(numberdistinct(arr));
        int [] nums = {4,5,6,7,1,2,3};
        int pos = invertedsearch(nums,2);
        System.out.println(pos);

    }
    public static boolean numberdistinct(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]) {
                    return true;
                }
            }
        }
       
        return false;
    }
    public static int invertedsearch(int[] nums, int target) {
        // min wil have index of min element of nums
        int min = minsearch(nums);

        // find in sorted left
        if (nums[min] <= target && target <= nums[nums.length-1]) {
            return search(nums,min,nums.length-1, target);

        }
        // find in sorted right
        else{
            return search(nums,0,min,target);
        }
    }
    public static int search(int[] nums,int left,int right, int target) {
        int l = left ;
        int r = right ;
        while(l<=r){
            int mid = l +(r-l)/2 ;
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }
    public static int minsearch(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while (left<right) {
            int mid = left + (right-left)/2;
            if (mid>0 && nums[mid-1] > nums[mid]) {
                return mid;
            }
            else if (nums[left] <= nums[mid] && nums[mid] > nums[right]) {
                left = mid + 1;
            }else{
                right = mid-1;
            }
        }
        return left;
    }
}
