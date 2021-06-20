package main;
import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Is palindrome ? ");
        String num = input.next();
        int count = 0;
        
        for (int i = 0, j = num.length() -1; i <= j; i++,  j--) {
          
            if (num.charAt(j) != num.charAt(i)) {
                count = 1;
                // count++;
            }
          
        }

        System.out.println(count == 0 ? "Yes" : "No");
        // if ((num.length() % 2 == 0 && count == num.length() / 2) || (num.length() % 2 == 1 && count == num.length() / 2 + 1)) {
        //     System.out.println("Yes");
        // } else{
        //     System.out.println("No");
        // }
    }
    
}
