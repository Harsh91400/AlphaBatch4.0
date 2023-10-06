package C_20_Recursion_pwSkills;

public class Count_of_digits {
    static int countDigit(int n){
/*
        if(n>=0 && n<=9){
            return count;
        }
        count++;
        countDigit(n/10);
        return count;
*/
//        if(n>0){
//            count++;
//            countDigit(n/10);
//        }
//        return count;

        if(n<10){
            return 1;
        }
        else{
            return 1+countDigit(n/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(countDigit(68532));
    }
}

