package TemelKavramlar;
import java.util.Scanner;

/**
 * BodyMassIndex
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        
        double height, weight, bodyMassIndex;
        Scanner scanner = new Scanner(System.in);



        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        height = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        weight = scanner.nextDouble();

        bodyMassIndex = weight / (height * height); 
        System.out.println("Vücut Kitle İndeksiniz : " + bodyMassIndex);
       


        
    }
}