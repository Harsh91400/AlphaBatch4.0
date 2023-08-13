package C_07_Functions_And_Methods;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Binamial_Factorial {
    public static int factorial(int n){
        int fact=1;
        for (int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();
        int factn = factorial(n);
        System.out.printf("Factorial of %d is : ",n);
        System.out.println(factn);
        int factr = factorial(r);
        System.out.printf("Factorial of %d is : ",r);
        System.out.println(factr);
        int factnr = factorial(n-r);
        System.out.printf("Factorial of %d is : ",n-r);
        System.out.println(factnr);
        System.out.println("====================== Binomial Coefficent ==================");
        double binomial = (factn)/(factr*factnr);
        System.out.println("Binomial is : " + binomial);
    }
}
