public class OOPS {
    public static void main(String[] args) {
        // pen p1 = new pen();
        // p1.setColor("blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("yellow");
        // System.out.println(p1.getColor());

        // BankAccount myACC = new BankAccount();
        // myACC.username = "shradhakhapra";


        // myACC.password = "abccdefghi";

        Student s1 = new Student();
        s1.name = "Satya";
        s1.roll = 456;
        s1.password = "abcde";
        s1.mark[0] = 100;
        s1.mark[1] = 99;
        s1.mark[2] = 98;

        Student s2 = new Student(s1);//copy
        s2.password = "xyz";
        s1.mark[2]=97;
        for(int i = 0; i<3 ; i++){
            System.out.println(s2.mark[i]);
        }

        // Student s2 = new Student("Satya");
        // Student s3 = new Student(22111004);
        // System.out.println(s1.name);
    }
}
           
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

class pen{
    private String color;
    private int tip;

    int getTip(){
        return this.tip;
    }

    String getColor(){
        return this.color;
    }

    void setColor(String newcolor){
        color = newcolor;

    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int roll;
    String password;
    int mark[];

    //Shallow Copy Constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     mark = new int[3];
    //     this.mark = s1.mark;
    // }

    //Deep Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        mark = new int[3];
        for (int i = 0; i < mark.length; i++) {
            this.mark[i] = s1.mark[i];
        }
    }

    Student(){
        mark = new int[3];
        System.out.println("constructor is called");
    }
    Student(String name){
        mark = new int[3];
        this.name = name;
    }
    Student(int roll){
        mark = new int[3];
        this.roll = roll;
        // System.out.println("constructor is called");
    }
}
