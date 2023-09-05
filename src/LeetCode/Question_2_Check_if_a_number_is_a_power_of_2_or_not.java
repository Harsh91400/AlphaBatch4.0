package LeetCode;

public class Question_2_Check_if_a_number_is_a_power_of_2_or_not {
    public static boolean powerOf2orNot(int n){
        //return n&(n-1);
//        if(n==0){
//            return false;
//        }
        return n>0 && (n&(n-1))==0;
    }
    public static void main(String[] args) {
//        int powerCheck=powerOf2orNot(1048);
//        if(powerCheck==0){
//            System.out.println("yes");
//        }
//        else{
//            System.out.println("Not");
//        }
        System.out.println(powerOf2orNot(0));
    }
}
