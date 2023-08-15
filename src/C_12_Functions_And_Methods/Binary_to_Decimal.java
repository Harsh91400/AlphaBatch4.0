package C_12_Functions_And_Methods;
import java.util.Scanner;

public class Binary_to_Decimal {
    public static void binToDec(int binNum) {
        int myNum=binNum;
        int pow = 0;
        int decNum = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));

            pow++;
            binNum = binNum / 10;
        }
        System.out.println("Decimal of " + myNum + " = "+ decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary NUmber : ");
        int bin=sc.nextInt();
        binToDec(bin);

    }
}
