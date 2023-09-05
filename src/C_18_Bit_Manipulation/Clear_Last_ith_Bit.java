package C_18_Bit_Manipulation;

public class Clear_Last_ith_Bit {
     public static int clearLastIthBit(int n,int i){
         //int bitMask=(-1)<<i;
         return n & ((-1)<<i);
     }
    public static void main(String[] args) {
        //System.out.println(clearLastIthBit(15,1));
        System.out.println((~0)<<3);
    }
}
