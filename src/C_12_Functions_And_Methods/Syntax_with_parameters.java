package C_12_Functions_And_Methods;
import java.util.Scanner;
public class Syntax_with_parameters {
    public static void sumoftwothrughinput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("============================== \nEnter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the second number : ");
        int b=sc.nextInt();
        int sum = a + b;
        System.out.print("Sum of first & Second Numbers is : ");
        System.out.println(sum);
    }
    public static int sumoftwo(int a,int b){
        int sum = a+b;
        System.out.println("Sum of a & b is : " + sum);
        int sub = a-b;
        return sub;

    }
    public static void main(String[] args) {
        sumoftwo(5,4);
        int Sub = sumoftwo(9,8);
        System.out.printf("Subtraction of a & b : " + Sub + "\n");
        sumoftwothrughinput();
    }
}
