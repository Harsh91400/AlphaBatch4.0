package C_14_Array;

public class Max_Subarray_Sum_Brute_Force {
    public static void maxSubArraySum(int arr[]) {
        int currSum=0;
        int maxSum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                currSum=0;
                for (int k = start; k <=end; k++) {
                    currSum+=arr[k]; //subArray
                }
                System.out.print(currSum);
                if(maxSum<currSum){
                    maxSum=currSum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max Sum =  : "+maxSum);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        maxSubArraySum(arr);
    }
}
