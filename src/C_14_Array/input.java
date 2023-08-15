package C_14_Array;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        
//        int marks[]=new int[100];
//
//        Scanner sc =new Scanner(System.in);
//
//        marks[0]=sc.nextInt();
//        marks[1]=sc.nextInt();
//        marks[2]=sc.nextInt();
//
//        System.out.println("Phy : "+marks[0]);
//        System.out.println("Sci : "+marks[1]);
//        System.out.println("Mat : "+marks[2]);


        // 2-D Array

        //int num[][]= new int[2][3];
//        int num[][]={
//                {4,2},
//                {5,6},
//                {6,8}
//        };
//        for(int i=0;i<=2;i++){
//            for (int j = 0; j <=1; j++) System.out.print(num[i][j] + " ");
//            System.out.println();
//        }

        // Jagged Array
//        int num[][]={
//                {4,2,5},
//                {5,6,2},
//                {6,8}
//        };
//        for(int i=0;i<=2;i++){
//            for (int j = 0; j <=3; j++) System.out.print(num[i][j] + " ");
//            System.out.println();
//        }


        // User Input
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        int arr[] = new int[n];


        System.out.print("Enter values : ");
        for (int i = 0; i < n; i++) {
              arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    
}
