public class inheritance {
    public static void main(String[] args) {
        // dog dobby = new dog();
        // dobby.eat();
        // dobby.legs = 4;
        // System.out.println(dobby.legs);
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Mammals extends Animal{
   void walk(){
    System.out.println("walks");
   }
}
class Fish extends Animal{
   void swim(){
    System.out.println("swims");
   }
}
class bird extends Animal{
   void fly(){
    System.out.println("fly");
   }
}

class dog extends Mammals{
    int breed;
}

// Derived class
// class Fish extends Animal{
//     int fins;

//     void swim(){
//         System.out.println("swim in water");
//     }
// }