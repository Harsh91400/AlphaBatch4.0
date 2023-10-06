package C_20_Recursion_pwSkills;

import static java.lang.Math.min;

public class Find_GCD {
    static int gcd(int a,int b,int m){
        if(m==1) return 1;  //Brute Force Approch

        if(a%m==0 && b%m==0) return m;

        return gcd(a,b,m-1);
    }


//    static int gcd(int a,int b){
//        while((a%b)!=0){
//            int rem=a%b;
//            a=b;
//            b=rem;
//        }
//        return b;
//    }

    static int gcd(int x,int y){
        if(y==0) return x;
        return gcd(y,x%y);
    }
    static int lcm(int a,int b,int gcd){
        int lcm=(a*b)/gcd;
        return lcm;
    }


    public static void main(String[] args) {
//        int a=7,b=11;+
//        int m=min(a,b);
//        System.out.println(gcd(a,b,m));
//        System.out.println(gcd(7,11));
        int gcd = gcd(16,12);
        int lcm=lcm(16,12,gcd);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
