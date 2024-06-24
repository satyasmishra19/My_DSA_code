// package strings;

public class compress {
    public static String compress(String str) {
        StringBuilder st = new StringBuilder("");
        // char ch = 0;
        st.append(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            int k =1;
            st.append(str.charAt(i));
            while(str.charAt(i)==str.charAt(i+1)) {
                i++;
                k++;
                // continue;
                if (k>1) {
                    
                    st.append(k);
                }
            }
            
        }
        return st.toString();
    }
    public static String comp(String str) {
        String newstr="";
        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count > 1) {
                newstr += count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
