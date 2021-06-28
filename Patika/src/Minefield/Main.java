package Minefield;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
		System.out.print("Sütun sayısı giriniz : ");
		int row = scan.nextInt();
		System.out.print("Satır sayısı giriniz : ");
		int column = scan.nextInt();
		
        MineSweeper mineSweeper = new MineSweeper(row, column);
        mineSweeper.run();
    }
    
}
