package C_11_Nested_loop;

public class inverted_star_pattern {
    public static void main(String[] args) {
        for(int i=4;i>0;i--){
            for(int j=i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
