package Loops;
import java.util.Scanner;


public class WhileEbobEkok {

    public static void main(String[] args) {
        int  num1, num2;
        int ebob = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number 1 :");
        num1 = input.nextInt();

        System.out.println("Enter the number 2 :");
        num2 = input.nextInt();


        int k = num1;
        while (k > 0) {
            if (num1 % k == 0  &&  num2 % k == 0) {
                ebob = k;
                System.out.println("Ebob : " + ebob);
                break;
            }
            k--;
        }
        
        int j = 1;
        while (j <=  num1 * num2) {
            if (j % num1 == 0  &&  j % num2 == 0) {

                System.out.println("Ekok : " + j);
                break;
            }
            j++;
        }
        
    }
    
}
