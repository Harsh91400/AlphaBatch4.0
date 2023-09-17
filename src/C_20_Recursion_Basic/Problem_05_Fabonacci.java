package C_20_Recursion_Basic;

public class Problem_05_Fabonacci {
    static int fib(int n){
//        if(n==0) return 0;
//        if(n==1) return 1;
        if(n==0 || n==1) return n;
        int fibnm1=fib(n-1);
        int fibnm2=fib(n-2);
//        int fibN=fibnm1+fibnm2;
//        return fibN;
        return fibnm1+fibnm2;
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fib(n));
        System.out.println(fib(6));
        System.out.println(fib(7));
    }
}
