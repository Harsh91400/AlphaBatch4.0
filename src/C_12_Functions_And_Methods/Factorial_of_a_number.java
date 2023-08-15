package C_12_Functions_And_Methods;

public class Factorial_of_a_number {
    public static int factorial(int n) {
        int fact = 1;
        for ( int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int n=5;
        int fact = factorial(n);
        System.out.printf("Factorial of %d is : ",n);
        System.out.println(fact);
    }
}
