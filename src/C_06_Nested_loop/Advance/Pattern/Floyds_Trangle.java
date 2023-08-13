package C_06_Nested_loop.Advance.Pattern;

public class Floyds_Trangle {
    public static void main(String[] args) {
        int k=1;
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d ",k);
                k++;
            }
            System.out.println();
        }
    }
}
