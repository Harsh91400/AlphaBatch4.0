package C_19_OOPS;

public class Class_and_Object {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created pen object
        p1.setColor("Aqua");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.calPercantage(50,50,50);
    }

}
class Pen{
    String color;
    int tip;
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;

    void calPercantage(int phy,int che,int math){
        percentage = (phy+che+math)/3;
        System.out.println(percentage);

    }
}
