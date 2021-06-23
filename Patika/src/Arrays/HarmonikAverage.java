package Arrays;
import java.util.Scanner;

/**
 * HarmonikAverage
 */
public class HarmonikAverage {

    public static void main(String[] args) {
        double[] numbers = {1, 2, 3, 4, 5};
        double result = 0;

        for (int i = 0; i < numbers.length; i++) {
                result += (1 / numbers[i]);

            System.out.println(result);
        }

        System.out.println(5 / result);
    }
}