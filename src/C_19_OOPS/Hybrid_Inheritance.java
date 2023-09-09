package C_19_OOPS;

public class Hybrid_Inheritance {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.thought();
        hm.walk();
        hm.eat();

    }
}
class Animals{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Fishes extends Animals{
    void swim(){
        System.out.println("Swims");
    }
}
class Tune extends Fishes {
    void smallFish(){
        System.out.println("Small Fish");
    }
}

class Shark extends Fishes {
    void bigFish(){
        System.out.println("Big Fish");
    }
}

//Bird Class
class Birds extends Animals{
    void fly(){
        System.out.println("Flying");
    }
}
class Peecock extends Birds {
    void bigBird(){
        System.out.println("Big Bird");
    }
}

class Mammals extends Animals{
    void walk(){
        System.out.println("Walks");
    }
}
class Dog extends Mammals {
    void soundDog(){
        System.out.println("Bhoo Bhoo");
    }
}
class Cat extends Mammals {
    void soundCat(){
        System.out.println("Meaauuu Meaauuu");
    }
}

class Human extends Mammals {
    void thought(){
        System.out.println("Thought process is very fast");
    }
}