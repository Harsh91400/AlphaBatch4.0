package C_09_If_else_statement;
import java.util.*;
public class practice_qs_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temp = sc.nextDouble();
        String condition=(temp>=103.5)?"You have a fever.":"You don't have a fever.\nEnjoy..";
        System.out.println(condition);
    }
}
