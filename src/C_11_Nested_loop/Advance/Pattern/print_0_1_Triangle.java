package C_11_Nested_loop.Advance.Pattern;

public class print_0_1_Triangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for (int j=0;j<i;j++){
                System.out.print(((i+j)%2));
            }
            System.out.println();
        }
    }
}
