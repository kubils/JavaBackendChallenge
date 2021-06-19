package TemelKavramlar;
import java.util.Scanner;

public class TriangleArea {

    public static void main(String[] args) {
        
        int a, b, c;
        double area; 

        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        
        int perimeter = a + b + c;

        double u = perimeter / 2;

        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println(area);
    }
}
