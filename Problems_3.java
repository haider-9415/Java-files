import My_Methods.*;
import java.util.Scanner;

public class Problems_3 {

    /* Problem 1 */
    /* Print elements of a given matrix spirally in clockwise direction */
    /* We will eliminate that row and column which will have been printed */
    public static void problem_1(int[][] matrix){

        int top = 0;                      // it refers to the first row
        int bottom = matrix.length-1;     // it refers to the last row
        int left = 0;                     // it refers to the first column
        int right = matrix[0].length-1;   // it refers to the last column
        int no_of_elements = 0;
        int direction = 0; /* If we use this, we have to use if statements and the condition of
                              while loop will be 'top<=bottom && left<=right' and to maintain rang of
                              direction from 0 to 3, we will use 'direction = (direction + 1)%4' and
                              we will have not to use 'no_of_elements < (matrix.length*matrix[0].length)'
                              in any for loop */

        // no. of elements == (no. of rows)*(no. of columns)
        while (no_of_elements < (matrix.length*matrix[0].length)){

            // to print topmost row
//            if (direction == 0){
                for (int i = left; i <= right && no_of_elements < (matrix.length*matrix[0].length); i++) {
                    System.out.print(matrix[top][i]+" ");
                    no_of_elements++;
                }
                // to eliminate topmost row
                top++;
//            }

            // to print rightmost column
//            if (direction == 1){
                for (int i = top; i <= bottom && no_of_elements < (matrix.length*matrix[0].length); i++) {
                    System.out.print(matrix[i][right]+" ");
                    no_of_elements++;
                }
                // to eliminate rightmost column
                right--;
//            }

            // to print lowermost row
//            if (direction == 2){
                for (int i = right; i >= left && no_of_elements < (matrix.length*matrix[0].length); i--) {
                    System.out.print(matrix[bottom][i]+" ");
                    no_of_elements++;
                }
                // to eliminate rightmost column
                bottom--;
//            }
            // to print leftmost column
//            if (direction == 3){
                for (int i = bottom; i >= top && no_of_elements < (matrix.length*matrix[0].length); i--) {
                    System.out.print(matrix[i][left]+" ");
                    no_of_elements++;
                }
                // to eliminate rightmost column
                left++;
//            }

//            direction = (direction + 1)%4;
        }
        System.out.println();
    }



    /* Problem 2 */
    /* Store elements from 1 to n^2 in a matrix of size n*n spirally in clock-wise direction*/
    public static void problem_2(int n){
        input_output_2D obj = new input_output_2D();
        int[][] matrix = new int[n][n];

        int top = 0;                      // it refers to the first row
        int bottom = matrix.length-1;     // it refers to the last row
        int left = 0;                     // it refers to the first column
        int right = matrix[0].length-1;   // it refers to the last column
        int element = 1;
        int direction = 0;

        while (top<=bottom && left<=right){

            // for topmost row
            if (direction == 0){
            for (int i = left; i <= right; i++) {
                matrix[top][i] = element++;
            }
            // to eliminate topmost row
            top++;
            }

            // for rightmost column
            if (direction == 1){
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = element++;
            }
            // to eliminate rightmost column
            right--;
            }

            // for lowermost row
            if (direction == 2){
            for (int i = right; i >= left; i--) {
                matrix[bottom][i] = element++;
            }
            // to eliminate lowermost row
            bottom--;
            }

            // for leftmost column
            if (direction == 3){
            for (int i = bottom; i >= top; i--) {
                matrix[i][left] = element++;
            }
            // to eliminate leftmost column
            left++;
            }

            direction = (direction + 1)%4;
        }
        obj.output_2D(matrix);
    }



    /* Problem 3 */
    /* Print elements of a given matrix spirally in anti-clockwise direction */
    /* We will eliminate that row and column which will have been printed */
    public static void problem_3(int[][] matrix){
        int top = 0;                      // it refers to the topmost row
        int bottom = matrix.length-1;     // it refers to the lowermost row
        int left = 0;                     // it refers to the leftmost column
        int right = matrix[0].length-1;   // it refers to the rightmost column
//        int no_of_elements = 0;
        int direction = 0; /* If we use this, we have to use if statements and the condition of
                              while loop will be 'top<=bottom && left<=right' and to maintain rang of
                              direction from 0 to 3, we will use 'direction = (direction + 1)%4' and
                              we will have not to use 'no_of_elements < (matrix.length*matrix[0].length)'
                              in any for loop */

        while (top<=bottom && left<=right){

            // to print topmost row
            if (direction == 0){
            for (int i = right; i >= left ; i--) {
                System.out.print(matrix[top][i]+" ");
            }
            // to eliminate topmost row
            top++;
            }

            // to print rightmost column
            if (direction == 1){
            for (int i = top; i <= bottom ; i++) {
                System.out.print(matrix[i][left]+" ");
            }
            // to eliminate rightmost column
            left++;
            }

            // to print lowermost row
            if (direction == 2){
            for (int i = left; i <= right ; i++) {
                System.out.print(matrix[bottom][i]+" ");
            }
            // to eliminate lowermost row
            bottom--;
            }
            // to print leftmost column
            if (direction == 3){
            for (int i = bottom; i >= top ; i--) {
                System.out.print(matrix[i][right]+" ");
            }
            // to eliminate leftmost column
            right--;
            }

            direction = (direction + 1)%4;
        }
        System.out.println();
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input_output_2D obj = new input_output_2D();

        /* Problem 1 */
        System.out.print("No. of rows: ");
        int row1 = sc.nextInt();
        System.out.print("No. of columns: ");
        int col1 = sc.nextInt();

        int[][] arr1 = new int[row1][col1];
        obj.input_2D(arr1);

        System.out.println("Original matrix");
        obj.output_2D(arr1);

        problem_1(arr1);




        /* Problem 2 */
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        problem_2(n);




        /* Problem 3 */
        System.out.print("No. of rows: ");
        int row2 = sc.nextInt();
        System.out.print("No. of columns: ");
        int col2 = sc.nextInt();

        int[][] arr2 = new int[row2][col2];
        obj.input_2D(arr2);

        System.out.println("Original matrix");
        obj.output_2D(arr2);

        problem_3(arr2);

    }
}
