package C_19_OOPS;

public class Inheritance {
    public static void main(String[] args) {
//        During Single level Inheritance

//        Fish shark= new Fish();
//        shark.eat();
//        shark.swim();
//        shark.breathe();

        // Multi level inheritance
//        Dog dg = new Dog();
//        dg.eat();
//        dg.legs();


        // Hierarchial Inheritance
        Birds br = new Birds();
        br.eat();

    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    }
}

// Single level inheritance

//class Fish extends Animal{
//    int fins; //wings of fish
//     void swim(){
//         System.out.println("Swims in water");
//     }
//}


//Multi level inheritance

//class Mammal extends Animal{
//    int leg;
//    void legs(){
//        System.out.println("4 legs");
//    }
//}
//class Dog extends Mammal{
//    String bread;
//}



 // Hierarchial Inheritance
class Mammal extends Animal{
    void walk(){
        System.out.println("Walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("flaying");
    }
}