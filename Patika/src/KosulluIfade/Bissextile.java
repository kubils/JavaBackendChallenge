package KosulluIfade;

import java.util.Scanner;

//leap year
public class Bissextile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a  year: ");
		int year = input.nextInt();

        if ((year % 4 == 0) && (year % 100 != 0)) {
            System.out.println(year + " is a bissextile");
        } else if (year % 400 == 0){
            System.out.println(year + " is a bissextile");
        } else {
            System.out.println(year + " is not a bissextile");
        }
    }
}
