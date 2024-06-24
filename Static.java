import java.util.Scanner;

public class Static {
    public static void main(String[] args) {
        student s1 = new student();
        s1.schoolname = "SSVM";

        student s3 = new student();
        s3.schoolname = "ABC";

        student s2 = new student();
        System.out.println(s2.schoolname);

        Scanner sc = new Scanner(System.in);
        int math = sc.nextInt();
        int phy = sc.nextInt();
        int chem = sc.nextInt();
        System.out.println(s1.returnpercentage(math, phy, chem));


    }
}

class student{
    static int returnpercentage(int math,int phy,int chem){

        return (math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolname;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}