// package strings;

import java.util.*;

public class basicString {
    public static void printLetters(String str) {
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // char arr[] = {'a','b','c','d'};
        // String str1 = "abcd";
        // String str2 = new String("xyz");

        // strings are IMMUTABLE

        // Scanner sc = new Scanner(System.in);
        // String name ;
        // name = sc.nextLine();
        // System.out.println(name);

        // concatenation
        // String firstName = "Satyashree";
        // String secondName = "Mishra";
        // String fullName = firstName+" "+secondName;
        // System.out.println(fullName);
        
        // printLetters(fullName);
        String str = "moon";
        System.out.println(ispalindrome(str));
        }
        public static boolean ispalindrome(String str) {
            for (int i = 0; i < str.length()/2; i++) {
                int n = str.length();
                if (str.charAt(i)!= str.charAt(n-1-i)) {
                    // not a pallindrome
                    // System.out.println("it is not a pallindrome");
                    return false;
                }
            }
            // System.out.println("it is a pallindrome");
            return true;
        }

}
