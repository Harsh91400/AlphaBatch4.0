package LeetCode;

public class Search_in_Rotated_And_Sorted_Array {
    static int search(int arr[],int target){
        int l=0,h=arr.length-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>=arr[l]){
                if(target>=arr[l] && target <arr[mid]){
                    h=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else{
                if(target>arr[mid] && target <= arr[l]){
                    l=mid+1;
                }
                else{
                    h=mid-1;
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,3));
    }
}
