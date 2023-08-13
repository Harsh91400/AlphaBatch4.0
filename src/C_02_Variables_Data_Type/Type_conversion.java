package C_02_Variables_Data_Type;
import java.util.*;
public class Type_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();
        System.out.println(number);
        int a = sc.nextByte();
        System.out.println(a);
        // byte > short > int > float > long > double
        // destination type > source type

    }
}
