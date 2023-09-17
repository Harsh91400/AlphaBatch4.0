package C_20_Recursion_Basic;

public class Problem_4_Sum_of_n_natural_numbers {
    public static int sumOfNatural(int n){
        if(n==1){
            return 1;
        }
        int num2=sumOfNatural(n-1);
        int sum = n+num2;
        return sum;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sumOfNatural(n));
    }
}
