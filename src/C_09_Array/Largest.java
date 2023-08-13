package C_09_Array;

public class Largest {
    public static void largestNum(int arr[]){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Largest element in this array is : "+max);
        System.out.print("Smallest element in this array is : "+min);
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,3,5};
        largestNum(arr);

    }
    
}
