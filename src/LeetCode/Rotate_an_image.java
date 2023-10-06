package LeetCode;

public class Rotate_an_image {
//    static void rotate(int arr[][],int n){
//        //int arr2[][] = new int[0][0];
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < arr[0].length; j++) {
////                arr2[j][i]=arr[i][j];
//
//                int temp=arr[i][j];
//                arr[i][j]=arr[j][i];
//                arr[j][i]=temp;
//            }
//        }
//        int left=0,right=arr[0].length-1;
//        while(left<right){
//            for (int i = 0; i < arr.length; i++) {
//                int temp=arr[i][left];
//                arr[i][left]=arr[i][right];
//                arr[i][right]=temp;
//            }
//            left++;
//            right--;
//        }
//    }
//    static void printArr(int arr[][],int n){
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }
public void rotate(int[][] matrix) {
    for(int i=0;i<matrix.length;i++){
        for(int j=i+1;j<matrix[0].length;j++){
            int temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;
        }
    }
    int left=0,right=matrix[0].length;
    while(left<right){
        for(int i=0;i<matrix.length;i++){
            int temp=matrix[i][left];
            matrix[i][left]=matrix[i][right];
            matrix[i][right]=temp;
        }
        left++;
        right--;
    }
}
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
//        int arr2[][] = new int[4][4];
//        int n=arr.length;
//        printArr(arr2,n);
//        rotate(arr,arr2,n);
//        printArr(arr2,n);

//        printArr(arr,n);
//        rotate(arr,n);
//        System.out.println();
//        printArr(arr,n);

    }
}
