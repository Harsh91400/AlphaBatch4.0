package C_20_Recursion_Basic;

public class print_1_to_n {
    public static void print(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }

        print(n-1);
        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        int n=10;
        print(n);
    }
}
