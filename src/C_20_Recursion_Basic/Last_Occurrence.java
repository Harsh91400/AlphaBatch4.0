package C_20_Recursion_Basic;

public class Last_Occurrence {
    public static int lastOcc(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isFound=lastOcc(arr,i+1,key);

        if(isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        int arr[]={8,36,9,5,10,2,5,3};
        int i=0,key=5;
        System.out.println(lastOcc(arr,key,i));

    }
}
