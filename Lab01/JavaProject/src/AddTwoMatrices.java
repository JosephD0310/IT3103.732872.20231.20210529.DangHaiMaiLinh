public class AddTwoMatrices {
	public static void main(String[] args) {
        int rows = 2, columns = 4;
        //Declare two matrices as multidimensional arrays
        int[][] MatrixA = {{1, 2, 3, 4}, {3, 1, 2, 3}};
        int[][] MatrixB = {{2, 2, 1, 5}, {1, 1, -3, 4}};
    /* Declare a matrix sum, which will be the sum of MatrixA and MatrixB,
        The sum matrix will have the same rows and columns as the given matrices.
     */
        int[][] sum = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = MatrixA[i][j] + MatrixB[i][j];
            }
        }
        //Print Sum Matrix
        System.out.println("The sum matrix of the two given matrices is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sum[i][j] + "    ");
            }
            System.out.println();
        }
}
}
