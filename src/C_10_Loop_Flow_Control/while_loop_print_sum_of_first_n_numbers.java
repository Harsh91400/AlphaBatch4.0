package C_10_Loop_Flow_Control;
import java.util.*;
public class while_loop_print_sum_of_first_n_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int counter=1;
        int sum=0;
        while(counter<=num){
            sum+=counter;
            System.out.println(sum);
            counter++;
        }
        System.out.println("Total : "+sum);
    }
}
