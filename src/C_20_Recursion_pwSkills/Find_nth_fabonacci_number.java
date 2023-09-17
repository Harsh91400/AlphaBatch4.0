package C_20_Recursion_pwSkills;

import java.util.Scanner;

public class Find_nth_fabonacci_number {
    static int fib(int n){
        if(n==0||n==1){
            return n;
        }
//        int fib1=fib(n-1);
//        int fib2=fib(n-2);
//        return fib1+fib2;

          return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            System.out.print(fib(i) + " ");
        }
    }
}
