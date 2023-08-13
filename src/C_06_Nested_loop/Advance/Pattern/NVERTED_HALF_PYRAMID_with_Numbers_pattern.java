package C_06_Nested_loop.Advance.Pattern;
import java.util.Scanner;
public class NVERTED_HALF_PYRAMID_with_Numbers_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row number :");
        int row = sc.nextInt();
        for (int i=row;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.printf("%d",j);
            }
            //for(int)
            System.out.println();
        }
    }
}
