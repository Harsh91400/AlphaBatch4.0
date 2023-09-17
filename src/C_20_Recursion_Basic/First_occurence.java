package C_20_Recursion_Basic;

public class First_occurence {
    public static int firstOcc(int arr[],int i,int key){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,i+1,key);
    }
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,6,8};
        int key=9;
        int i=0;
        System.out.println(firstOcc(arr,i,key));
    }
}
