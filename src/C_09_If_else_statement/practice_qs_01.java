package C_09_If_else_statement;
import java.util.*;
public class practice_qs_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String type = (a>=0)?"Positive":"Negative";
        System.out.println(type);
    }
}
