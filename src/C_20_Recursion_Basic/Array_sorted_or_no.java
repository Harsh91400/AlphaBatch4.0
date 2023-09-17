package C_20_Recursion_Basic;

public class Array_sorted_or_no {
    public static boolean isSorted(int arr[],int i){
//        for(int i=1;i<n;i++){ //using for loop
//            if(arr[i-1]<=arr[i]) return true;
//            else return false;
//        }
//        return false;

        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return isSorted(arr,i+1);

    }

    public static void main(String[] args) {
        int arr[]={1,1,3,4,7,6};
//        int n=arr.length;
        int i=0;
        System.out.println(isSorted(arr,i));

    }
}