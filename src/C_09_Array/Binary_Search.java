package C_09_Array;

public class Binary_Search {
    public static int binarySearch(int arr[],int key){
        int a=0;
        int l=arr.length-1;
        while(a<=l){
            int mid=(a+l)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                a=mid+1;
            }
            else{
                l=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,8,9};
        int key=5;
        System.out.print("Index for key is: "+ binarySearch(arr, key));
    }
    
}
