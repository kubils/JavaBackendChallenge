package Arrays;

import java.util.Arrays;

public class ArrayValueCount {

    public static void main(String[] args) {
        int[] list = { 10, 20, 20, 10, 10, 20, 5, 20, 5, 13, 13, 20 };

        int[] freq = new int[list.length];

        Arrays.sort(list);

        System.out.println("Dizi : " + Arrays.toString(list));

        int count = 1;
        for (int i = 0; i < list.length - 1; i++) {

            if (count > 1) {
                // jump with count to index same number in array
                i += count - 1;
                if (i > list.length - 1) {
                    break;
                }
                
                count = 1;
            }
            

            for (int k = i + 1; k < list.length; k++) {
                if (list[i] == list[k]) {
                    count++;
                } else {
                    freq[i] = count;
                    break;
                }

                if (k == list.length - 1) {
                    freq[i] = count;
                }
            }
            System.out.println(list[i] + " sayısı " + freq[i] + " kere tekrar edildi");
        }

    }
}
