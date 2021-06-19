package KosulluIfade;

import java.util.Scanner;

public class CalculatorSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        String operator;

        System.out.println("Enter first number");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number");
        num2 = scanner.nextDouble();

        System.out.println("Select operator: +, -, *, /");
        operator = scanner.next();


        switch (operator) {
            case "+":
                System.out.println("Sum is :" + (num1 + num2));
                break;
            case "-":
                System.out.println("Substraction is :" + (num1 - num2));

                break;
            case "*":
                System.out.println("Multiplication is :" + (num1 * num2));

                break;
            case "/":
                System.out.println("Division is :" + (num1 / num2));

                break;
            default:
                break;
        }

    }

}
