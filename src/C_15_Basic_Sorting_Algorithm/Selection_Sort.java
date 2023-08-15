package C_15_Basic_Sorting_Algorithm;

public class Selection_Sort {
    public static void selectionSort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int minPos=i;
            for (int j = i+1; j < n; j++) {
                if(arr[minPos]>arr[j]){
                    minPos = j;
                }
            }
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        selectionSort(arr);
    }
}
