package C_06_Nested_loop.Advance.Pattern;
import java.util.Scanner;
public class Inverted_Rotated_Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row=sc.nextInt();
        for (int i=1;i<=row;i++){
            for(int j=i;j<row;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.printf("*");
            }
            System.out.println();

        }
    }
}
