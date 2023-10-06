package LeetCode;

public class Monotonic_Array {
    public static boolean isMonotonic(int[] nums) {
        boolean isIncreasing=true,isDecreasing=true;
        for(int i=1;i<=nums.length-1;i++){
            if(nums[i]<nums[i-1]){
                isIncreasing = false;
                break;
            }
            if(nums[i]>nums[i-1]) isDecreasing = false;
        }
        return isIncreasing || isDecreasing;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3};
        System.out.println(isMonotonic(arr));
    }
}
