package C_20_Recursion_pwSkills;

public class Find_sum_with_alternate_sign {
    static int findSum(int n){
       if(n==0) return 0;
//       int sum = findSum(n-1) + n;
//       return sum;
       return findSum(n-1) + n;
    }
    static int findAltSum(int n){
        if(n==0) return 0;
        if(n%2==0){
            return findAltSum(n-1) - n;
        }
        else{
            return findAltSum(n-1) + n;
        }
    }


    public static void main(String[] args) {
        System.out.println(findSum(5));
        System.out.println(findAltSum(5));
    }

}
