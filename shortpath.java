// package strings;

import java.util.*;
// package strings;

public class shortpath {
    public static void shortpath(String str) {
        double sum =0;
        int x=0,y=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)== 'E') {
                x+=1;
            }
            if (str.charAt(i)== 'W') {
                x-=1;
            }
            if (str.charAt(i)== 'S') {
                y-=1;
            }
            if (str.charAt(i)== 'N') {
                y+=1;
            }
        }
        System.out.println(x);
        System.out.println(y);
        sum=Math.sqrt((x*x)+(y*y));
        System.out.println(sum);
    }
    public static void main(String[] args) {
      String str = "WNEENESENNN";
      shortpath(str);

    }
}
