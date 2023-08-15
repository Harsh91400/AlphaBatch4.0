package C_13_Pattern_Advanced;

public class Inverted_Half_Pyramid_With_Number {
    public static void printPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
