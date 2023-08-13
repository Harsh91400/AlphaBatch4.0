package C_09_Array;
import java.util.Scanner;
public class Linear_Search {
    public static int linearSearch(int num[],int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] ={14,25,36,75,96,64};
        System.out.print("Enter the Key value : ");
        int key=sc.nextInt();

        int index=linearSearch(num, key);
        if(index==-1){
            System.out.print("Key is not present in the list");
        }
        else{
            System.out.print("Key is at index : "+ index);
        }
    }
    
}
