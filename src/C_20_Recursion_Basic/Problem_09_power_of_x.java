package C_20_Recursion_Basic;

public class Problem_09_power_of_x {
    public static int pow(int x,int n){
        if(n==0) return 1;
        //if(n==1) return x;
        int power=x*pow(x,n-1);
        return power;
    }
    public static void main(String[] args) {
        System.out.println(pow(2,0));
        System.out.println(pow(2,1));
        System.out.println(pow(2,10));
        System.out.println(pow(2,11));

    }
}
