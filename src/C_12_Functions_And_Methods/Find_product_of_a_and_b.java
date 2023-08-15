package C_12_Functions_And_Methods;

public class Find_product_of_a_and_b {
    public static int product(int a,int b){
        int pro = a*b;
        System.out.println(pro);
        return pro;
    }

    public static void main(String[] args) {
        int mul = product(8,7);
        System.out.println(mul);
    }
}
