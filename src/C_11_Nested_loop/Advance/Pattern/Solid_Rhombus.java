package C_11_Nested_loop.Advance.Pattern;

public class Solid_Rhombus {
    public static void main(String[] args) {
        for ( int i=1;i<=4;i++){
            for ( int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for ( int j=i;j<=4;j++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }
}
