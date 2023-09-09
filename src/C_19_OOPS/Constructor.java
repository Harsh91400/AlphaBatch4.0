package C_19_OOPS;

public class Constructor {
    public static void main(String[] args) {
        Students s1 = new Students("Harshit");
        System.out.println(s1.name);
        Students s2 =new Students();
    }
}

class Students {
    String name;
    int roll;
    Students(String name){
        //System.out.println("Constructor is called....");
        this.name=name;
    }
    Students(){
        System.out.println("Constructor is called....");
    }
}
