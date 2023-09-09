package C_19_OOPS;

public class Method_Overloading {
    public static void main(String[] args) {
        Calculator cal= new Calculator();
        System.out.println(cal.sum(5.56,4.35));
    }
}
class Calculator{
    int sum(int a,int b){
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
