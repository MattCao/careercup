/**
 * Created with IntelliJ IDEA.
 * User: caoyangkaka
 * Date: 3/29/13
 * Time: 12:16 AM
 * To change this template use File | Settings | File Templates.
 */
/*
 *Question:
 * Given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate the image by 90 degrees. Can you do
 * this in place?
 * My idea:
 * the array is just acting like this: the orginial[i][j] = newArray[j][N - 1 - i]
 * But the problem of this solution is that: the space and time issues space N*N and time is also N*N
 */
public class p1_6 {
    public static void main (String args[]) {
        Invert example = new Invert ();
        int[][] original = {{1,2,3,4,5},{5,6,7,8,9},{9,10,11,12,10},{13,14,15,16,17},{18,19,20,21,22}};
        int[][] newOne = example.rotateNew(original);
        for(int i = 0; i < newOne.length; i++) {
            for(int j = 0; j < newOne[i].length; j++) {
                System.out.print(newOne[i][j] + "\t");
            }
            System.out.print("\n");
        }
    }
}

class Invert{
    public int[][] rotate(int[][] original) {
        int length = original.length;
        int[][] newOne = new int[length][length];
        for(int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                newOne[j][length -1 - i] = original[i][j];
            }
        }
        return newOne;
    }

    public int[][] rotateNew(int[][] matrix) {
    	for (int i = 0; i < matrix.length / 2; i++) {
			for (int j = i; j < matrix.length - i - 1; j++) {
				int tmp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length - 1 - j][i];
				matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
				matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
				matrix[j][matrix.length - 1 - i] = tmp;
			}
		}
		return matrix;
    }
}