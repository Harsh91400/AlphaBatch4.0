package LeetCode;

public class Sqrt {
    static int sqrt(int x){
//        int i=1;
//        while(i*i<=x){
//            i++;
//        }
//        return sqrt(i-1);

//        for (int i = x/2; i > 0 ; i--) {
//            if(x>=i*i){
//                return i;
//            }
//        }
//        return 0;

        //Apply binary search
        long start=1;
        long end=x;
        long ans=0;
        while(start<=end){
            long mid=(start+end)/2;
            if(mid*mid == x){
                ans = (int)mid;
                break;
            }
            else if(mid*mid < x) {
                ans = mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int x=649865241;
        System.out.println(sqrt(x));
    }
}
