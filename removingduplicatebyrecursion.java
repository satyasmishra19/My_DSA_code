public class removingduplicatebyrecursion {
    public static void removingduplicate(String str, StringBuilder newStr, boolean map[] ) {
        int idx =0;
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kam
        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            //duplicate
            idx++;
            removingduplicate(str, newStr, map);
        }else{
            map[currChar-'a'] = true;
            idx++;
            removingduplicate(str, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        int idx =0;
        removingduplicate(str,new StringBuilder(""),new boolean[26]);
    }

}
