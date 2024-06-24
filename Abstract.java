public class Abstract {
    public static void main(String[] args) {
    //    horse h = new horse();
    //    h.eat();
    //    h.walk();
    //    System.out.println(h.color);
       
    //    chicken c= new chicken();
    //    c.eat();
    //    c.walk();
    //    System.out.println(c.color);
    mustang myhorse = new mustang();
    }
}

abstract class Animals{
    String color;

    Animals(){
        color ="brown";
        System.out.println("animal constructor called");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class horse extends Animals{
    horse(){
        System.out.println("horse constructer called");
    }
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class mustang extends horse{
    mustang(){
        System.out.println("mustang constructer called");
    }
}

class chicken extends Animals{
    void changeColor(){
        color = "Yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}