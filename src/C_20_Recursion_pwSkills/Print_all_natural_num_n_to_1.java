package C_20_Recursion_pwSkills;

import java.util.Scanner;

public class Print_all_natural_num_n_to_1 {
    static void printNatural(int n){
        //Base case
        if(n==1){
            System.out.println(1 + " ");
            return;
        }
        //Self Work
        System.out.print(n + " ");

        //Smaller Problem Or Recursive Work
        printNatural(n-1);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n=sc.nextInt();
        printNatural(n);
    }
}
