public class integertoenglish {
    public static void  tens(int s) {
        String stk = "";
        if (s==1) {
            stk +="one";
            System.out.print(stk);
        }

    } 

    public static void  numberToWords(int n) {
        int s = 0;
        if (n/1000 != 0) {
            s = n/1000;
            tens(s);
            System.out.print(" Thousand");
        }
    }
    public static void main(String[] args) {
        System.out.print(numberToWords(1000));
    }
}
