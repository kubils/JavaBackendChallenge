package main;
import java.io.*;
import java.util.*;

//Java Subarray

public class JavaSubarray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        int count = 0;
        for (int j = 0; j < arr.length; j++) {

            int sum = 0;
            for (int k = j; k < arr.length; k++) {
                sum += arr[k];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);

    }
}