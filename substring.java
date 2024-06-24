// package strings;

public class substring {
    public static String ssubstring(String str,int oi,int ei) {
        String substr = "";
        for (int i = oi; i < ei; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str = "helloworld";
        System.out.println(ssubstring(str,3,4));
        System.out.println(str.substring(3, 4));
    }
}
