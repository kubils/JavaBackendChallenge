package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrayElements {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array size n : ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". value :");
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.print("Sıralama : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    
}
