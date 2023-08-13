package C_08_Pattern_Advanced;
import java.util.Scanner;
public class Inverted_Rotated_Half_Pyramid {
    public static void printPyramid(int n){
        for (int i=1;i<=n;i++){
            for( int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of n : ");
        int n=sc.nextInt();
        printPyramid(n);

    }
}
