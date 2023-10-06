package LeetCode;

public class Single_Number {
    static int singleNumber(int []nums){
        int ans=0;
        for(int num:nums){
            ans=ans^num;
        }
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={4,1,2,3,1,4,2};
        System.out.println(singleNumber(nums));
    }
}
