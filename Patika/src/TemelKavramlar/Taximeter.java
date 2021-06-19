package TemelKavramlar;
import java.util.Scanner;

public class Taximeter {

    public static void main(String[] args) {
        
        int km;
        double taximeter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter distance KM type : ");
        km = scanner.nextInt();

        taximeter = 10 + km * 2.20;

        double amount = taximeter <= 20 ? 20 : taximeter; 

        System.out.println(amount);

    }
    
}
