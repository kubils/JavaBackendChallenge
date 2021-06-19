package TemelKavramlar;
import java.util.Scanner;

public class CircleArea {
    
    public static void main(String[] args) {
        
        double pi = 3.14, r, a, area;
        Scanner scanner = new Scanner(System.in);


        r = scanner.nextDouble();
        a = scanner.nextDouble();

        area = (pi * r * r * a) / 360;

        System.out.println(area);
        
    }
}
