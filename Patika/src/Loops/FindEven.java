package Loops;

import java.util.Scanner;

/**
 * Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
*/
public class FindEven {
    
    public static void main(String[] args) {
        int num, average, sum = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            
            if (i % 12 == 0) {
                sum += i;
                count++;
            }
        }

        average = sum / count;
        System.out.println("Average is : " + average);

    }
}
