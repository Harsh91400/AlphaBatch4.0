package CP;

import java.util.Scanner;

public class Contest_291_DIV_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Input");
        char a[]=sc.next().toCharArray();
        for (int i = 0; i < a.length; i++) {
            if(a[i]>'4'){
                a[i]=(char)('9'-a[i]+ '0');
                System.out.println(a);
            }
        }
    }
}
