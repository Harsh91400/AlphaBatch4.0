package C_18_Bit_Manipulation;

public class Question_3_Count_set_bits {
    public static int countSetBit(int n){
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSetBit(10));
    }
}
