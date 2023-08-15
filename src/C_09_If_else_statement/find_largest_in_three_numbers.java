package C_09_If_else_statement;

public class find_largest_in_three_numbers {
    public static void main(String[] args) {
        int a,b,c;
        a=895;
        b=45;
        c=45;
        if(a>=b && a>=c){
            System.out.println("A is a greater number");
        }
        else if(b>=c){
            System.out.println("B is a greater number");
        }
        else{
            System.out.println("C is a greater number");
        }
    }
}
