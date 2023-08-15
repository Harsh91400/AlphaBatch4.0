package C_09_If_else_statement;
import java.util.*;
public class Switch_statement_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a=sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b=sc.nextInt();
        System.out.print("Enter the Operator : ");
        char operator=sc.next().charAt(0);
        switch(operator){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println((float)a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            default:
                System.out.println("Invaild Entry. Try Again");
        }

    }
}
