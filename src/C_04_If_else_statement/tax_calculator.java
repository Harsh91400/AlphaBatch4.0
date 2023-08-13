package C_04_If_else_statement;
import java.util.*;
public class tax_calculator {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your annual income : ");
        int income= sc.nextInt();
        if(income < 500000){
            System.out.println("Don't need to pay tex : \nEnjoy");
        }
        else if(income>=500000 && income < 1000000){
            int tax = 20*(income/100);
            System.out.println("You have to pay "+ tax +" Rs Tax of your income.\nThank You");
        }
        else{
            int tax = 30*(income/100);
            System.out.println("You have to pay "+tax+" Rs Highest Tax of your income.\nThank You.");
        }
    }
}
