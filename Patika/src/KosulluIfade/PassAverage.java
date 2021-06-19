package KosulluIfade;

import java.util.Scanner;

public class PassAverage {

    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music;
        int total = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("math note : ");
        math = scanner.nextInt();
        if (math >= 0 && math <= 100) {
            total += math;
            count++;
        }

        System.out.println("physics note : ");
        physics = scanner.nextInt();
        if (math >= 0 && math <= 100) {
            count++;
            total += math;
        }

        System.out.println("turkish note : ");
        turkish = scanner.nextInt();
        if (turkish >= 0 && turkish <= 100) {
            count++;
            total += turkish;
        }

        System.out.println("chemistry note : ");
        chemistry = scanner.nextInt();
        if (chemistry >= 0 && chemistry <= 100) {
            count++;
            total += chemistry;
        }

        System.out.println("music note : ");
        music = scanner.nextInt();
        if (music >= 0 && music <= 100) {
            count++;
            total += music;
        }

        

        int average = total / count;


        System.out.println(average >= 55 ? "Passed to class!" : "Failed to class!");
        System.out.println("Average note : " + average);
    }
}
