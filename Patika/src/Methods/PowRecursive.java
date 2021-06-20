package Methods;
import java.util.Scanner;

public class PowRecursive {

    static int pow(int x, int y) {
        
        if (y == 0) {
            return 1;
        } else {return x * pow(x, y - 1);}
    }
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int base = scan.nextInt();
        System.out.print("Üs değeri giriniz :");
        int exponent = scan.nextInt();

        System.out.println("Sonuç : " + pow(base, exponent));
    }
    
}
