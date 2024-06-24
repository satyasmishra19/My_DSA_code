// package strings;

import java.util.Scanner;

public class qnaString {
    public static void countlowercase(String s) {
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            char ch =  s.charAt(i);

            if (ch == 'a' ||ch== 'e' ||ch== 'i' ||ch=='o' || ch== 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
    // public static void main(String[] args) {
    //     String s = new Scanner(System.in).next();
    //     countlowercase(s);
    // }
    // public static void main(String[] args) {
    // String str="ShradhaDidi";
    // String str1="ApnaCollege";
    // String str2="ShradhaDidi";
    // System.out.println(str.equals(str1) +" "+str.equals(str2));
    // }
    // public static void main(String[] args) {
    //     String str="ApnaCollege".replace("l","");
    //     System.out.println(str);
    // }
    public static void main(String[] args) {
        String st1 = new Scanner(System.in).next();
        String st2 = new Scanner(System.in).next();
        int a =0;
        anagram(st1,st2,a);
    }
    public static boolean anagram(String st1,String st2,int a) {
        StringBuilder str1 = new StringBuilder("") ;
        StringBuilder str2 = new StringBuilder("");
        str1.append(st1);
        str2.append(st2);
        int count =0;
        int cout =0;
        
        if (st1.length()==st2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str1.length(); j++) {
                    if (str1.charAt(i)==str1.charAt(j)) {
                        count++;
                    }
                    if (str1.charAt(i)==str2.charAt(j)) {
                        cout++;
                    }
                }
                if (count!=cout) {
                    a++;
                }
            }
            if (a>0) {
                System.out.println("it is not an anagram");
                return false;
            }else
                System.out.println("it is an anagram");
                return true;
        }
        return false;
        
    }
}
