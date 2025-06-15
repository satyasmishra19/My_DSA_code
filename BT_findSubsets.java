public class BT_findSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }

    public static void findSubsets(String str, String ans, int i) {
        //base case
        if (i==str.length()) {
            if (ans=="") {
                System.out.println("Null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        
        //yes choice
        findSubsets(str, ans+str.charAt(i), i+1);
        //no choice
        findSubsets(str, ans, i+1);
    }
}
