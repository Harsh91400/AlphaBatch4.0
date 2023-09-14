package LeetCode;

public class Majority_Element {
    public static int majorityElement(int[] nums) {
        int candidate =nums[0];
        int n=nums.length;
        int count=1;
        for(int i=1;i<n;i++){
            if(nums[i]==candidate) count++;
            else count--;

            if(count==0){
                candidate = nums[i];
                count =1;
            }
        }
        count = 0;
        for(int val : nums){
            if(val == candidate) count++;
        }
        if(count > n/2){
            return candidate;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int nums[]={1,1,4,4,5,2,1,4,1,1,4,5,1,1,4,1,4,5,1,1,1,1,1,};
        System.out.println(majorityElement(nums));

    }
}
