package C_05_Loop_Flow_Control;
import java.util.*;
public class while_loop_print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter= 1;
        int num = sc.nextInt();
        while(counter<=num){
            System.out.println(counter);
            counter++;
        }
    }
}
