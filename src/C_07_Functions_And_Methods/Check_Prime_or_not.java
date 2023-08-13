package C_07_Functions_And_Methods;

import java.util.Scanner;

public class Check_Prime_or_not {
    public static boolean isPrime(int n){
        //Corner cases
        //2
        if(n==2){
            return true;
        }

        boolean isPrime=true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        boolean isPrime = isPrime(n);
        if(isPrime==true){
            System.out.printf("%d is a Prime Number.",n);
        }
        else{
            System.out.printf("%d is not a Prime Number.",n);
        }
    }




 // Normal Type

    /*public static void isPrime(int n){
        if (n==1 || n==2) {
            System.out.printf("%d is a Prime Number.",n);
        }
        else{
            for (int i=2;i<n;i++){
                if(n%i==0){
                    System.out.printf("%d is not a Prime Number.",n);
                    break;
                }
                else {
                    System.out.printf("%d is a Prime Number.",n);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        isPrime(n);

    }*/
}
