package C_13_Pattern_Advanced;

public class Hollow_Ractengular {
    public static void hello_rectengle(int totRows, int totCols){
        // outer loop
        for(int i=1;i<=totRows;i++){
            //Inner Loop
            for(int j=1;j<=totCols;j++){
                //cel - (i,j)
                if(i==1 || i==totRows || j==1 || j==totCols){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        hello_rectengle(10,5 );
    }
}
