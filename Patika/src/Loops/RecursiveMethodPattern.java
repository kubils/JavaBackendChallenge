package Loops;
import java.util.Scanner;

public class RecursiveMethodPattern {

    public static void main(String[] args) {
        
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();
        boolean flag = true;
        int temp = num;
        patterMethod(num, flag, temp);
    }

    static int patterMethod(int num, boolean flag, int temp) {
        System.out.print(num + " ");
     
        if (flag == false) {
            if (num == temp) {
                return 0;
            } else {
                return patterMethod(num + 5, flag, temp);
            }
        
        }
        else {
            if (num <= 0) {
                return patterMethod(num +5, false, temp);

            } else {
                
                return patterMethod(num -5, true, temp);
            }
        }
    }
    
}
