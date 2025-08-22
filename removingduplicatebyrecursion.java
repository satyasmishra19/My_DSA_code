public class removingduplicatebyrecursion {
    public static void removingduplicate(String str, int idx ,StringBuilder newStr, boolean map[] ) {
        //int idx =0;
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kam
        char currChar = str.charAt(idx);
        if (map[currChar-'a']==true) {
            //duplicate
            //idx++;
            removingduplicate(str,idx+1, newStr, map);
        }else{
            map[currChar-'a'] = true;
            //idx++;
            removingduplicate(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        int idx =0;
        removingduplicate(str ,0 , new StringBuilder(""),new boolean[26]);
    }

}
