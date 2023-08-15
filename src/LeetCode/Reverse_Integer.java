package LeetCode;

public class Reverse_Integer {
    public static int reverseInteger(int num) {
        int rev=0;
        while(num!=0){
            int digit=num%10;
            if(rev>Integer.MAX_VALUE/10 || rev<Integer.MIN_VALUE){
                return 0;
            }
            rev=(rev*10)+digit;
            num=num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num=123;
        System.out.println(reverseInteger(num));
    }
}
