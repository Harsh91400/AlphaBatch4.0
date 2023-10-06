package C_20_Recursion_pwSkills;

public class Print_all_its_value {
    static void printAll(int arr[],int idx){
        if(idx==arr.length) return;
        System.out.print(arr[idx]  + " ");
        printAll(arr,idx+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,5,4,2,1};
        printAll(arr,0);
    }
}
