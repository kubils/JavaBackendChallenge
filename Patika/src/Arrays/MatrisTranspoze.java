package Arrays;


public class MatrisTranspoze {
   
   
    private static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }
    }

    private static void transpozeMatrix(int[][] twoDimArray, int[][] transArray) {

        
        for (int i = 0; i < twoDimArray[0].length; i++) {
            for (int j = 0; j < twoDimArray.length; j++) {
                transArray[i][j] = twoDimArray[j][i];
             }
        }
    }

    
    private static void createMatrix(int[][] twoDimArray) {
        for (int row = 0; row < twoDimArray.length; row++) {
            for (int column = 0; column < twoDimArray[row].length; column++) {
                twoDimArray[row][column] = (int) (Math.random() * 100);
            }
        }
    }


    public static void main(String[] args) {

        int[][] twoDimArray = new int[2][3];

        createMatrix(twoDimArray);


        int[][] transArray = new int[twoDimArray[0].length][twoDimArray.length];

        System.out.println("Matris : ");

        printMatrix(twoDimArray);

        
        System.out.println("Transpoze : ");
        transpozeMatrix(twoDimArray, transArray);
        printMatrix(transArray);
    }
}
