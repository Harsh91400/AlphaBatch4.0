package C_14_Array;

public class Passing_Array_As_Argument {
    public static void update(int marks[],int nonChangable){
        int nonchangable=10;
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonChangable=5;
        update(marks,nonChangable);
        System.out.println(nonChangable);

        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
