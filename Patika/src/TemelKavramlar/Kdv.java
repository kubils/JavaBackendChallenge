package TemelKavramlar;
import java.util.Scanner;

/**
 * Kdv
 */
public class Kdv {

    public static void main(String[] args) {
       
        double total, kdvRate = 0.18, withKDVTotal, kdvTotal;  
        double kdvBgRate = 0.8;
        boolean kdvType;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Fee amount");
        total = scanner.nextDouble();

        kdvType = (total <= 1000 && total > 0);

        kdvRate = kdvType ? kdvRate : kdvBgRate;

        kdvTotal = total * kdvRate;
        withKDVTotal = kdvTotal + total;

        System.out.println("Main money :" + total);
        System.out.println("KDV rate : " + kdvRate);
        System.out.println("KDV total : " + kdvTotal);
        System.out.println("With KDV total : " + withKDVTotal);

    }
}