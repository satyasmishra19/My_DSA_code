public class Trappingrainwater {
    public static int trappedrainwater(int height[]) {
        int n = height.length;
        // calculate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // calculate right max boundry - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedwater = 0;
        // loop
        for (int j = 0; j < n; j++) {
            // waterlevel = min{leftmax bound, rightmax bound}
            int waterlevel = Math.min(leftmax[j], rightmax[j]);

            // trapped water = water level - height[i]
            trappedwater += waterlevel - height[j];
        }
        return trappedwater;

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedrainwater(height));
    }
}
