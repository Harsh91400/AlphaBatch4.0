package C_20_Recursion_Basic;

public class Print_n_to_1 {
    public static void print(int n){
        if(n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        print(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        print(n);
    }
}