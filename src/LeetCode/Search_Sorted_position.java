package LeetCode;

public class Search_Sorted_position {
    static int searchPos(int []arr,int target){
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,3,4,5,6};
        int target=2;
        System.out.println(searchPos(arr,target));
    }
}
