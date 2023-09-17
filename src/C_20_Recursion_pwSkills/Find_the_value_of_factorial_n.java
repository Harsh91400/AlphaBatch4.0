package C_20_Recursion_pwSkills;

public class Find_the_value_of_factorial_n {
    static int fact(int n){
        //Base case
        if(n==0){
            return 1;
        }

        return n*fact(n-1);  //Self Work * Recursive work

    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(n));
        System.out.println(fact(0));
        System.out.println(fact(1));
    }
}
