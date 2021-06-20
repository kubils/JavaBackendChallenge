package Loops;
/**
 * 
 * 11333527 KAÇ TANE TEKRARLAYAN VAR RECURSIVE BUL
 * 11  ve  333  => count = 2
 */
public class RecursiveRepetitveNum {


        public static void main(String[] args) {

            int x = 11333527;
            int count = 0;
            System.out.println(rec(x,count));
        }

        private static int rec(int x, int count) {

            if (x / 10 == 0) {
                return count;
            } else {
                if ((x % 10 == (x /10) % 10) &&  ((x/100) % 10 !=  x % 10)) {
                    count++;
                }
                return rec(x / 10, count);
            }
        }
}