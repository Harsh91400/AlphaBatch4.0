package C_15_Basic_Sorting_Algorithm;

import java.util.Arrays;

public class Inbuit_Sort {
    public static void inbuiltSort(int arr[]) {
//        Arrays.sort(arr,0,3);
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        int arr[]={4,1,2,3,5,6,8};
        inbuiltSort(arr);
    }
}
