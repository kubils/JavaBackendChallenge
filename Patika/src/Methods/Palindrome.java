package Methods;
import java.util.Scanner;

public class Palindrome {

    private static boolean isPalindrome(int num) {
        int temp = num, digit, newNum = 0;

        while (temp != 0) {
            
            digit = temp % 10;

            newNum = (newNum * 10) + digit;

            temp /= 10;

        }

        System.out.println(newNum);

        if (num == newNum) {
            return true;
        } else {return false;}
    }
    public static void main(String[] args) {
        
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number :");
        num = input.nextInt();

        System.out.println(isPalindrome(num) ? "Number is a palindrome" : "Number is not a palindrome");
    }
    
}
