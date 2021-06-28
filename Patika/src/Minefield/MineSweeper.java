package Minefield;

import java.util.Scanner;

public class MineSweeper {

    int row;
    int column;
    int mines;
    int spacesLeft;
    int[][] board;
    String[][] stateIndex;
    boolean[][] mineMap;

    MineSweeper(int row, int column) {
        this.row = row;
        this.column = column;
        this.mines = (row * column) / 4;
        this.spacesLeft = this.row * this.column - this.mines;
        this.stateIndex = new String[row][column];
        this.mineMap = new boolean[row][column];
        this.board = new int[row][column];
    }

    public void run() {
        System.out.println("===========================");
        initBoardToMines();
        initCount(mineMap);

        printMinesLocation(mineMap);

        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        play();
    }

    private void initBoardToMines() {
        int mine = this.mines;
        while (mine > 0) {

            int mineR = (int) (this.row * Math.random());
            int mineC = (int) (this.column * Math.random());

            // is there a mine in
            if (!this.mineMap[mineR][mineC]) {
                mineMap[mineR][mineC] = true;
                mine--;
            }
        }
    }

    private void initCount(boolean[][] mineMap) {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.column; j++) {
                
                if (mineMap[i][j]) {
                    //if i = 0 j = 0
                    for (int l = i - 1; l <= i + 1; l++) {
                        for (int k = j - 1; k <= j + 1; k++) {
                            if (l >= 0 && k >= 0 && k < this.column && l < this.row) {
                                //holds numbers
                                board[l][k] +=  1;
                            }
                        }
                        
                    }
                }
                //for hiding
                stateIndex[i][j] = "?";
            }
        }
    }

    private void printMinesLocation(boolean mineMap[][]) {
        System.out.println("Mayınların Konumu");

        for (int r = 0; r < this.row; r++) {
            for (int c = 0; c < this.column; c++)
                if (mineMap[r][c] == true) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(stateIndex[r][c] + " ");
                }
            System.out.println("");
        }
        System.out.println("");
    }

    private void play() {
        boolean alive = true;

        while(alive && this.spacesLeft > 0) {

            System.out.println("===================================");
            printBoard();

            if(guess(getRow(), getColumn())) {
                alive = true;
            } else {
                alive = false;
            }
            spacesLeft--;
        }

        if(alive) {
            System.out.println("Oyunu Kazandınız !");
            printBoard();
        } else {
            System.out.println("Game Over!!");
        }

        System.out.println("===================================");
    }

    private boolean guess(int row, int column) {

        if (mineMap[row][column]) {
            return false;
        } else {
            stateIndex[row][column] = board[row][column] + "";
            return  true;
        }
    }

    private int getColumn() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Satır Giriniz : ");
        int column = scanner.nextInt();

        while (column < 0 || column >= this.column) {
            System.out.println("Yanlış satır girdiniz tekrar giriniz!");
            System.out.print("Satır Giriniz : ");
            column = scanner.nextInt();
        }
        return column;
    }

    private int getRow() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sütun Giriniz : ");
        int row = scanner.nextInt();

        while (row < 0 || row >= this.row) {
            System.out.println("Yanlış satır girdiniz tekrar giriniz!");
            System.out.print("Sütun Giriniz : ");
            row = scanner.nextInt();
        }
        return row;
    }

    private void printBoard() {
        for (int r = 0; r < this.row; r++)
		{
			for (int c =0; c <this.column; c++)
				System.out.print(stateIndex[r][c] + " ");
			System.out.println("");
		}
    }

}