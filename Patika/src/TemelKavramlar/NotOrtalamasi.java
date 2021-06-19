package TemelKavramlar;
import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        int math, physics, turkish, histroy, music;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("math note : ");
        math = scanner.nextInt();

        System.out.println("physics note : ");
        physics = scanner.nextInt();

        System.out.println("turkish note : ");
        turkish = scanner.nextInt();

        System.out.println("histroy note : ");
        histroy = scanner.nextInt();

        System.out.println("music note : ");
        music = scanner.nextInt();

        int total = (math + physics + turkish + histroy + music) / 5;

        System.out.println(total >= 60 ? "Passed!" : "Failed!");
    }
    
}
