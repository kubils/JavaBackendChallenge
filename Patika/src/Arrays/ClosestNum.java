package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestNum {

    public static void main(String[] args) {

        int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };

        System.out.println("Array : " + Arrays.toString(list));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entered number : ");
        int num = scanner.nextInt();

        int minL = list[0];
        int minH = list[0];
        int lowerDistance = 0, higherDistance = 0;

        for (int i : list) {

            if (num > i) {

                if (num - i < minL) {
                    minL = num - i;
                    lowerDistance = i;
                }
            }

            if (num < i) {
                if (i - num < minH) {
                    minH = i - num;
                    higherDistance = i;
                }

            }

        }
        System.out.println("Closest small number from entered : " + lowerDistance);
        System.out.println("Closest big number from entered : " + higherDistance);

    }
}
