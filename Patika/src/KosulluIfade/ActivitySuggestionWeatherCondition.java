package KosulluIfade;

import java.util.Scanner;

public class ActivitySuggestionWeatherCondition {

    public static void main(String[] args) {
        
        int heat;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weather condition :");
        heat = scanner.nextInt();

        if (heat < 5) {
            System.out.println("Go skiing");
        } else if (heat >= 5 && heat < 10) {
            System.out.println("Go to cinema");
        } else if (heat >= 10 && heat <=15) {
            System.out.println("Go to picnik or go to cinema");
        } else if (heat >= 16 && heat <=25) {
            System.out.println("Go to picnic");
        } else {
            System.out.println("Go to swimming");
        }
    }
}
