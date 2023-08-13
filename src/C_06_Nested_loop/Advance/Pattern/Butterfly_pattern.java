package C_06_Nested_loop.Advance.Pattern;

public class Butterfly_pattern {
    public static void main(String[] args) {
        //Upper Part of Butter-fly
        for (int i=1;i<4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for ( int j=i;j<4;j++){
                System.out.print("  ");
            }
            for ( int j=i;j<4;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

                System.out.println();
        }
        // Lower Part of Butter-fly
        for (int i=4;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for ( int j=i;j<4;j++){
                System.out.print("  ");
            }
            for ( int j=i;j<4;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
