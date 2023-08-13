package C_08_Pattern_Advanced;

public class Pyramid_0_1_triangle {
    public static void printPyramid(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
