package C_20_Recursion_pwSkills;

import java.util.Scanner;

public class Print_all_natural_num_1_to_n {
    public static void naturalNum(int n){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        naturalNum(n-1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        naturalNum(n);
    }
}
