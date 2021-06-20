package Loops;


public class PrimeNum {

    public static void main(String[] args) {

        int isPrime;

        for (int j = 1; j < 101; j++) {
            isPrime = 0;
            if (j == 0 || j == 1) {
                isPrime = 1;
            } else {
                for (int i = 2; i <= j / 2; i++) {
                    if (j % i == 0) {
                        isPrime = 1;
                    }
                }
                if (isPrime == 0) {
                    System.out.print(j + " ");
                }
            }

        }
    }
}
