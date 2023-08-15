package C_07_Variables_Data_Type;
import java.util.*;
public class practice_Qus_03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        System.out.print("Cost of these items : ");
        float cost=pencil+pen+eraser;
        System.out.println(cost);
        System.out.print("GST : ");
        float gst= 18*(cost/100);
        System.out.println(gst);
        System.out.print("total : ");
        float total = cost + gst;
        System.out.println(total);
    }
}
