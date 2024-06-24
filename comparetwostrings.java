// package strings;

import java.util.*;

public class comparetwostrings {
    // public static void main(String[] args) {
    //     String s1 = "Tony";
    //     String s2 = "Tony";
    //     String s3 = new String("Tony");

    //     // this is the right way to check two strings
    //     if (s1.equals(s3)) {
    //         System.out.println("Strings are equal");
    //     }
    // }
    public static void main(String[] args) {
        String fruits[] = {"apple","banana","mango"};

        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
