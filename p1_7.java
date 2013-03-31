/**
 * Created with IntelliJ IDEA.
 * User: caoyangkaka
 * Date: 3/29/13
 * Time: 12:16 AM
 * To change this template use File | Settings | File Templates.
 */
/*
 *Question:
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.
 * My idea:
 * the idea is just checking the validation of each rows and columns firstly, then check the validation and change then 
 * correspondingly. Time: M*N, space (M + N)
 */
public class p1_7 {
    public static void main (String args[]) {
        int[][] original = {{1,2,3,0,5},{5,6,7,8,9},{9,10,11,12,10}};
        int[][] newOne = rotateNew(original);
        for(int i = 0; i < newOne.length; i++) {
            for(int j = 0; j < newOne[i].length; j++) {
                System.out.print(newOne[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }

    public static int[][] rotateNew(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        boolean[] rowCheck = new boolean[rows];
        boolean[] colsCheck = new boolean[cols];

        //zero checks
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    rowCheck[i] = true;
                    colsCheck[j] = true;
                }
            }
        }

        //for the rows
        for(int i = 0; i < rows; i++) {
            if(rowCheck[i]){
                for(int j = 0; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for(int j = 0; j < cols; j++) {
            if(colsCheck[j]){
                for(int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        //System.out.println(rows + ": for rows.");
        //System.out.println(cols + ": for column.");
        return matrix;
    }
}