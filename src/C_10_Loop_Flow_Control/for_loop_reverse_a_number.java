package C_10_Loop_Flow_Control;

public class for_loop_reverse_a_number {
    public static void main(String[] args) {
        int n=10899;
        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit + " ");
            n=n/10;
        }
        /*for(i=0;i<=len;i++){
            int lastdigit=n%10;
            int rlastdegit=n/10;
            System.out.print(n);
        }*/
    }
}
