package C_09_Array;

public class Print_SubArray {
    public static void printSubArray(int arr[]) {
        int ts=0;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                for (int k = start; k <=end; k++) {
                    System.out.print(arr[k]+ " "); //subArray
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Sub Array is : "+ts);

    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArray(arr);
    }
}
