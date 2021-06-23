package Arrays;

import java.util.Arrays;

public class RepeatingNumbers {

    static boolean hasValue(int i, int[] temp) {

        for (int j : temp) {
            if (j == i) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1};

        int[] temp = new int[list.length];

        System.out.println(Arrays.toString(list));

        int index = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = i+1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    if (!hasValue(list[i],temp)) {
                        temp[index++] = list[i];
                    }
                    break;
                }
            }
        }

        for (int value : temp){
            if (value != 0){
                System.out.print(value + " ");
            }
        }
    }   
}
