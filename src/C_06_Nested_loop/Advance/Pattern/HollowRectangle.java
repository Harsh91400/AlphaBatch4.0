package C_06_Nested_loop.Advance.Pattern;

public class HollowRectangle {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || i ==4 || j==1 || j == 5){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

                // if((5/j)== (0 || 5))
            }
            System.out.println(" ");

        }
    }
}