package C_09_If_else_statement;
import java.util.*;
public class practice_qs_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year%4)==0){
            if((year%100)!=0){
                System.out.println("Leap Year.");
            }
            else{
                if((year%400)==0){
                    System.out.println("Leap Year.");
                }
                else{
                    System.out.println("Not Leap Year.");
                }
            }

        }
        else{
            System.out.println("Not leap Year - 2.");
        }
    }
}
