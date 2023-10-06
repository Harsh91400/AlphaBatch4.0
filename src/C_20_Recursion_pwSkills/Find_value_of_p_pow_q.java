package C_20_Recursion_pwSkills;

public class Find_value_of_p_pow_q {
    static int pq(int p,int q) {
//        if (q < 1) {
//            return 1;
//        }
////        int ans=p*p;
//        return p*pq(p,q-1);
//    }

        //Second Approch
        if (q == 0) return 1;
        int smallpow = pq(p,q/2);
        if (q % 2 == 0) return smallpow * smallpow;
        else return p * smallpow * smallpow;
    }

    public static void main(String[] args) {
        System.out.println(pq(5,4));
    }
}
