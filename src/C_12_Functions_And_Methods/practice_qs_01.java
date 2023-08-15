package C_12_Functions_And_Methods;
import java.util.Scanner;
public class practice_qs_01 {
    public static double avg(double a,double b,double c){
        double avgOfNum=(a+b+c)/3;

        return avgOfNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        double x=sc.nextDouble();
        System.out.print("Enter the value of y : ");
        double y=sc.nextDouble();
        System.out.print("Enter the value of z : ");
        double z=sc.nextDouble();
        double avg=avg(x,y,z);
        System.out.println("Average of These "+ x + ", "+y + " and " +z + " are " +avg);
    }
}
