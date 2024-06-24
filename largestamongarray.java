public class largestamongarray {
    public static void main(String[] args) {
        int number[] = {2,4,26,8,20,12,14,16};
        int key = number[0];

        int highest_number = number[0];

        for (int i = 1; i < number.length; i++) {
            if (highest_number <= number[i]) {
                highest_number = number[i];        
            }else{
                highest_number = highest_number;
            }
        }
        System.out.println("greatest number in an array is "+highest_number);

    }
}
