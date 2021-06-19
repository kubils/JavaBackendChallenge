package KosulluIfade;

import java.util.Scanner;

public class PlainTicketFee {

    public static void main(String[] args) {
        
        int km, travelType, age;

        double kmFee = 0.10, totalFee;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance km type");
        km = scanner.nextInt();

        System.out.println("Enter travel type 1-Round trip \t 2-Oneway");
        travelType = scanner.nextInt();

        System.out.println("Enter age");
        age = scanner.nextInt();

        if ((km < 1) || (travelType > 2 || travelType < 1) || age < 1) {
            System.out.println("Incorrect data type entered!");
            System.exit(0);
        }


        totalFee = km * kmFee;
        // double ageDiscount = totalFee * 

        if (age < 12) {
            totalFee -= totalFee * 0.5;
        } else if (age > 12 || age < 24) {
            totalFee -= totalFee * 0.1;
        } else if (age > 65) {
            totalFee -= totalFee * 0.3;
        }

        if (travelType == 1) {
            totalFee -= totalFee * 0.2;
            totalFee *= 2;
        } 

        System.out.println("Total fee = " + totalFee + "TL");

        
    }
    
}
