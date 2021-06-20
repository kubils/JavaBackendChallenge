package Loops;
import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        double count = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        double num = input.nextInt();
        double result = 0;
        while (num >= count) {
            result += (1 / count);
            count++;
        }
        System.out.println(result);
    }
}
