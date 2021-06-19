package TemelKavramlar;
import java.util.Scanner;

/**
 * ManavKasa
 */
public class ManavKasa {

    public static void main(String[] args) {
        
        double armutKg = 2.14, elmanKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlıcanKg = 5;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Armut Kaç Kilo ? : ");
        double armutTotal = scanner.nextInt();

        System.out.println("Elma  Kaç Kilo ? : ");
        double elmaTotal =  scanner.nextInt();

        System.out.println("Domates Kaç Kilo ? : ");
        double domatesTotal = scanner.nextInt();


        System.out.println("Muz Kaç Kilo ? : ");
        double muzTotal = scanner.nextInt();

        System.out.println("Patlıcan Kaç Kilo ? : ");
        double patlıcanTotal =  scanner.nextInt();


        double total = (armutTotal * armutKg) + (elmanKg * elmaTotal) 
                        + (domatesKg * domatesTotal) + (muzKg * muzTotal)
                         + (patlıcanKg * patlıcanTotal);

        System.out.println("Toplam Tutar : " + total);
    }
}