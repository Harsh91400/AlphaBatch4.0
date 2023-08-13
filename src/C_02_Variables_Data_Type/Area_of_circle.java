package C_02_Variables_Data_Type;
import java.util.*;
public class Area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float r=sc.nextFloat();
        float pi=3.14f;
        float area=pi*r*r;
        System.out.println(area);
    }
}
