//package LeetCode;
//
//import java.util.ArrayList;
//
//public class Spiral_Matrix {
//    public static int printSpiral(int arr[][]){
//        int row=arr.length;
//        int col=arr[0].length;
//        List <Integer> list= new ArrayList();
//
//        if(row==0) return list;
//        int l=0,r=col-1,t=0,b=row-1,d=0;
//
//        while(l<=r && t<=b){
//            if(d==0){
//                for(int i=l;i<=r;i++){
//                    list.add(arr[t][i]);
//                }
//                d=1;t++;
//            }
//            else if(d==1){
//                for (int i = t; i <=b; i++) {
//                    list.add(arr[i][r]);
//                }
//                d=2;r--;
//            } else if (d==2) {
//                for (int i = r; i >=l ; i--) {
//                    list.add(arr[b][i]);
//                }
//                d=3;b--;
//            } else if (d==3) {
//                for (int i = b; i >=t ; i--) {
//                    list.add(arr[i][l]);
//                }
//                d=0;l++;
//            }
//        }
//        return list;
//
//
//
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//
//}
