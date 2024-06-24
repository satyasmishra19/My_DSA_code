public class Max_array {
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes(number);
    }

    // wrost method to find sum in respect to time complexity


    public static void max_subarray(int number[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        int maxarray[] = new int[number.length];
        maxarray[0] = number[0];
        for (int i = 1; i < maxarray.length; i++) {
            maxarray[i] = maxarray[i-1] + number[i];
            System.out.println(maxarray[i]);
        }
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                // int sum = 0;
                // for (int k = start; k <= end; k++) {
                //     System.out.print(number[k]+" ");
                //     sum+=number[k];
                // }
                // ts++;
                // System.out.println();
                // System.out.println("the sum of an array is "+sum);

                currsum = start==0 ? maxarray[end] : maxarray[end] - maxarray[start-1];

                if (maxsum <= currsum) {
                    maxsum = currsum;
                }
            }
            System.out.println();
        }
        System.out.println("Total subarray are = "+currsum);
        System.out.println("maximun sum of subarray = "+maxsum);

    }

    public static void kadanes(int number[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        
        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }

        System.out.println("our max subaaray sum is : " + ms);
    }
    // public static void max_subarray(int number[]) {
    //     int maxarray[] = new int[number.length];
    //     maxarray[0] = number[0];
    //     for (int i = 1; i < number.length; i++) {
    //         maxarray[i] = maxarray[i-1] + number[i];
    //         System.out.println(maxarray[i]);
    //     }
//     }
}
