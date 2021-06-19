package KosulluIfade;

import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {

        String astro_sign = "";
        String month;
        int day;
        Scanner scanner = new Scanner(System.in);
        boolean isError = false;
        System.out.println("Enter day : ");
        day = scanner.nextInt();
        System.out.println("Enter month : ");
        month = scanner.next();

        if (month.equals("january")) {
            if (day >= 1 && day <= 31) {
                if (day < 20)
                    astro_sign = "Oğlak ";
                else
                    astro_sign = "Kova";
            } else {
                isError = true;
            }
        }

        else if (month.equals("february")) {
            if (day >= 1 && day <= 28) {
                if (day < 19)
                    astro_sign = "Kova";
                else
                    astro_sign = "Balık";
            } else {
                isError = true;
            }

        }

        else if (month.equals("march")) {
            if (day >= 1 && day <= 31) {
                if (day < 21)
                    astro_sign = "Balık";
                else
                    astro_sign = "Koç";
            } else {
                isError = true;
            }
        } else if (month.equals("april")) {
            if (day >= 1 && day <= 31) {
                if (day < 20)
                    astro_sign = "Koç";
                else
                    astro_sign = "Boğa";
            } else {
                isError = true;
            }
        } else if (month.equals("december")) {
            if (day >= 1 && day <= 30) {
                if (day < 22)
                    astro_sign = "Yay";
                else
                    astro_sign = "Oğlak ";
            } else {
                isError = true;
            }

        }

        if (isError == true) {
            System.out.println("Day format is incorrect");
            
        } else {
            System.out.println("Your zodiac sign is " + astro_sign);
        }
    }
}
