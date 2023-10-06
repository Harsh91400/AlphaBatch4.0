package C_20_Recursion_pwSkills;

public class Print_k_multiples_of_sum {
    static void printMul(int n, int k){
        if(k==0) return;
        printMul(n,k-1);
        System.out.println(n*k);
    }

    public static void main(String[] args) {
        printMul(12,5);
    }
}
