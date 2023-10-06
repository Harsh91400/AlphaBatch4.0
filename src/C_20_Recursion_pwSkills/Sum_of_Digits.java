package C_20_Recursion_pwSkills;

public class Sum_of_Digits {
    static int sumD(int n){
        //Base case
        if(n>=0 && n<=9){
            return n;
        }
//        return sumD(n%10)+sumD(n/10);
        return (n%10)+sumD(n/10); //self work + recursive work
    }

    public static void main(String[] args) {
        System.out.println(sumD(8888));
    }
}
