package main;
import java.util.Scanner;

public class StringPalindrome {

    
    private static boolean isPalindrome(String s) {

        for (int i = 0, j = s.length() -1; i <= j; i++,  j--) {
          
            if (s.charAt(j) != s.charAt(i)) {
                return false;
            }
          
        }
        return true;
        
    }

    private static boolean isPalindromeWhile(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Is palindrome ? ");
        String num = input.next();
        


        System.out.println(isPalindrome(num) ? "Yes" : "No");
        // if ((num.length() % 2 == 0 && count == num.length() / 2) || (num.length() % 2 == 1 && count == num.length() / 2 + 1)) {
        //     System.out.println("Yes");
        // } else{
        //     System.out.println("No");
        // }
    }
    
}
