package C_12_Functions_And_Methods;
import java.util.Scanner;
public class practice_qs_02 {
    public static boolean isEven(int num) {
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num=sc.nextInt();

        if(isEven(num)){
            System.out.println("NUmber is Even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
