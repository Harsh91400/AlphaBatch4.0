package C_18_Bit_Manipulation;

public class Clear_Range_of_Bits {
    public static int clearRangeOfBits(int n,int i,int j){
        int a=(-1)<<j+1;
        int b=(1<<i)-1;
        int c=a|b;
        return n&c;
    }
    public static void main(String[] args) {
        System.out.println(clearRangeOfBits(2515,2,7));
    }
}
