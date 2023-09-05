package LeetCode;

public class Number_Of_1_Bits_191 {
    public int hammingWeight(int n){
        int count=0;
        int helper=1;
        for (int i = 1; i <=32 ; i++) {
            if((helper & n)!=0){
                count++;
            }
            helper=helper<<1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(00000000000000000000000010000000);
    }
}
