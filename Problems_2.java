import java.util.Scanner;
import My_Methods.*;
public class Problems_2 {

    /* problem-1 Method-1*/
    /* Display the transpose of a given matrix */
    // Remember this method is for both square and rectangular matrix
    public static int[][] problem_1_1(int[][] mat1){
        input_output_2D obj = new input_output_2D();

        // if a matrix has 'no. of row = a' and 'no. of col = b' then its transpose has 'no. of row = b' and 'no. of col = a'
        int[][] res1 = new int[mat1[0].length][mat1.length]; // for the transpose

        for (int i = 0; i < res1[0].length; i++) {
            for (int j = 0; j < res1.length; j++) {

                res1[j][i] = mat1[i][j];
            }
        }
        System.out.println("Transpose of the original");
        obj.output_2D(res1);
        return res1;
    }

    /* problem-1 Method-2*/
    public static void problem_1_2(int[][] mat2){
        input_output_2D obj = new input_output_2D();

        for (int i = 0; i < mat2.length; i++) {
            /* in this case, we will have to swap elements of upper right triangle of the matrix
               to the elements of lower left triangle of the matrix once, therefore, 'j=i' */
            // Remember this method is only for square matrix
            if (mat2.length != mat2[i].length){
                System.out.println("This is not a square matrix ");
                /* We will use return statement, because it stops the function and
                   break keyword only stops loop*/
                return;
            }
            else {
                for (int j = i; j < mat2.length; j++) {
                    if (mat2[i][j] != mat2[j][i]){
                        int temp = mat2[i][j];
                        mat2[i][j] = mat2[j][i];
                        mat2[j][i] = temp;
                    }
                }
            }
        }
        System.out.println("Transpose of the original");
        obj.output_2D(mat2);
    }



    /* Problem 2 */
    /* rotate a given matrix 90 degree */
    public static void problem_2(int[][] mat3){
        input_output_2D obj = new input_output_2D();

        mat3 = problem_1_1(mat3);

        // to reverse each element of the matrix
        for (int i = 0; i < mat3.length ; i++) {
            int index=0; // it will be used as index no.
            for (int j = mat3[i].length-1; j >= 0 ; j--) {
                if (j > index){
                    int temp = mat3[i][index];
                    mat3[i][index++] = mat3[i][j];
                    mat3[i][j] = temp;
                }
                else {
                    break;
                }
            }
        }
        System.out.println("After rotation ");
        obj.output_2D(mat3);
    }



    /*Problem 3 */
    /* Display Pascal's triangle for first 'n' index */
    public static void problem_3(int n){
        input_output_2D obj = new input_output_2D();
        int[][] matrix = new int[n][];

        for (int i = 0; i < n; i++) {
            // to initialize columns for every ith row externally
            matrix[i] = new int[i+1];
            // each row has 'i+1' columns, therefore, 'j < i+1'
            for (int j = 0; j < i+1; j++) {
                // first and last columns are always 1
                if (j == 0 || j == i){
                    matrix[i][j] = 1;
                }
                else {
                    matrix[i][j] = matrix[i-1][j]+matrix[i-1][j-1];
                }
            }
        }

        System.out.println("Pascal's triangle for "+n+" index");
        obj.output_2D(matrix);


    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input_output_2D obj = new input_output_2D();



        /* Problem 1 */

        // Method 1
        System.out.print("No. of rows: ");
        int row1 = sc.nextInt();
        System.out.print("No. of columns: ");
        int col1 = sc.nextInt();

        int[][] arr1 = new int[row1][col1];
        obj.input_2D(arr1);

        System.out.println("Original matrix");
        obj.output_2D(arr1);

        problem_1_1(arr1);


        // Method 2
        System.out.println("No. of rows should be equal to no. of columns \n");
        System.out.print("No. of rows: ");
        int row2 = sc.nextInt();
        System.out.print("No. of columns: ");
        int col2 = sc.nextInt();

        int[][] arr2 = new int[row2][col2];
        obj.input_2D(arr2);

        System.out.println("Original matrix");
        obj.output_2D(arr2);

        problem_1_2(arr2);




        /* Problem 2 */
        System.out.print("No. of rows: ");
        int row3 = sc.nextInt();
        System.out.print("No. of columns: ");
        int col3 = sc.nextInt();

        int[][] arr3 = new int[row3][col3];
        obj.input_2D(arr3);

        System.out.println("Original matrix");
        obj.output_2D(arr3);

        problem_2(arr3);




        /* Problem 3 */
        System.out.print("Enter no. of index: ");
        int n = sc.nextInt();
        problem_3(n);











    }
}
