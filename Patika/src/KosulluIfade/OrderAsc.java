package KosulluIfade;
import java.util.Scanner;

public class OrderAsc {

    public static void main(String[] args) {
        int num1, num2, num3;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three number to sort : ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        num3 = scanner.nextInt();

        if ((num1 < num2) && (num1 < num3)) {
            
            if (num2 < num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if((num2 < num3) && (num2 < num1)){
            if (num1 < num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num2 < num1) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else {
                System.out.println(num3+ " " + num2 + " " + num1);
            }
        }


    }
    
}
