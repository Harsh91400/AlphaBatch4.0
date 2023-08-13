package C_05_Loop_Flow_Control;

public class for_loop_reverse_a_given_number {
    public static void main(String[] args) {
        int n=987654;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;

            n=n/10;
        }
        System.out.print(rev);
    }
}
