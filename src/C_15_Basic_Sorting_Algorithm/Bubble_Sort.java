package C_15_Basic_Sorting_Algorithm;

public class Bubble_Sort {
    public static void bubbleSort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");

        }
    }
    public static void main(String[] args) {
        int arr[]={4,2,5,3,6,1};
        bubbleSort(arr);
    }
}
