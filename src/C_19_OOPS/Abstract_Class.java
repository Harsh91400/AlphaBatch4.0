package C_19_OOPS;

public class Abstract_Class {
    public static void main(String[] args) {
//        Horse h= new Horse();
//        h.walk();
//        h.eat();
//        System.out.println(h.color);
//        Chicken c =new Chicken();
//        c.walk();
//        c.eat();
//        System.out.println(c.color);
        Mustang myHorse = new Mustang();
        // Hierarcy of Cunstructor call Animal -> Hourse -> Mustang
    }

}
abstract class Animal_2{  // Beacuse of in C_19_OOPS there is already made a class which name is Animal
      String color;
//    Animal_2(){
//        color = "Brown";
//    }
    Animal_2(){
        System.out.println("Animal");
    }
    void eat(){
        System.out.println("Animal Eats");
    }

    abstract void walk();
}
class Horse extends Animal_2{
    void walk(){ // It is mendatory to impliment because Animal_2 has walk
        System.out.println("Walks on 4 legs");
    }
    void changeColor(){
        color="Dark Brown";
    }
    Horse(){
        System.out.println("Horse");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang");
    }
}
class Chicken extends Animal_2{
    void walk(){
        System.out.println("Walks on 2 legs");
    }
    void changeColor(){
        color="Yello";
    }
}