package C_18_Bit_Manipulation;

public class Question_01_Check_Odd_or_Even {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n & bitMask) ==0 ){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    public static void main(String[] args) {
        oddOrEven(12121250);
    }
}
