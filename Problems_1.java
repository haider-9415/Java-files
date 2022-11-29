import java.util.Scanner;

public class Problems_1 {

    /* Problem 1 */
    /* Add two matrices */
    public static void problem_1(int[][] arr1, int[][] arr2){

        int[][] result1 = new int[arr1.length][arr1[0].length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {

                result1[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        for (int i = 0; i < result1.length; i++) {
            System.out.print("Row "+i+": ");
            for (int j = 0; j < result1[i].length; j++) {

                System.out.print(result1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }




    /* Problem 2 */
    /* Multiply 'A' matrix of size 'r1*c1' by 'B' matrix of size 'r2*c2' */
    /* Remember 'c1 == r2' and the result should be of size 'r1 == c2' */
    public static void problem_2(int[][] arr3, int[][] arr4){

        int[][] result2 = new int[arr3.length][arr4[0].length];

        if (arr3[0].length == arr4.length){
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr4[0].length; j++) {
                    for (int k = 0; k < arr4.length; k++) {
                        result2[i][j] += arr3[i][k]*arr4[k][j];
                    }
                }
            }

            System.out.println("First matrix:");
            for (int i = 0; i < arr3.length; i++) {
                System.out.print("row "+i+": ");
                for (int j = 0; j < arr3[i].length; j++) {
                    System.out.print(arr3[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\n");
            System.out.println("Second matrix:");
            for (int i = 0; i < arr4.length; i++) {
                System.out.print("row "+i+": ");
                for (int j = 0; j < arr4[i].length; j++) {
                    System.out.print(arr4[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\n");

            System.out.println("Their multiplication: ");
            for (int i = 0; i < result2.length; i++) {
                System.out.print("row "+i+": ");
                for (int j = 0; j < result2[i].length; j++) {
                    System.out.print(result2[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println("\n");
        }
        else {
            System.out.println("c2 != r1, multiplication can't possible ");
        }
        System.out.println("\n");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /* Problem 1 */
        System.out.print("No. of rows: ");
        int row = sc.nextInt();
        System.out.print("No. of columns: ");
        int col = sc.nextInt();

        System.out.println("Enter elements for first matrix ");
        int[][] arr1 = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("row "+i+": ");
            for (int j = 0; j < col; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for second matrix ");
        int[][] arr2 = new int[row][col];
        for (int i = 0; i < row; i++) {
            System.out.println("row "+i+": ");
            for (int j = 0; j < col; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        System.out.println("First matrix:");
        for (int i = 0; i < row; i++) {
            System.out.print("row "+i+": ");
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Second matrix:");
        for (int i = 0; i < row; i++) {
            System.out.print("row "+i+": ");
            for (int j = 0; j < col; j++) {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\n");

        System.out.println("Their sum:");
        problem_1(arr1,arr2);




        /* Problem 2 */
        System.out.print("r1: ");
        int r1 = sc.nextInt();
        System.out.print("c1: ");
        int c1 = sc.nextInt();

        System.out.println("Enter elements for first matrix ");
        int[][] arr3 = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            System.out.println("row "+i+": ");
            for (int j = 0; j < c1; j++) {
                arr3[i][j] = sc.nextInt();
            }
        }

        System.out.print("r2: ");
        int r2 = sc.nextInt();
        System.out.print("c2: ");
        int c2 = sc.nextInt();
        System.out.println("Enter elements for second matrix ");
        int[][] arr4 = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            System.out.println("row "+i+": ");
            for (int j = 0; j < c2; j++) {
                arr4[i][j] = sc.nextInt();
            }
        }

        // to call the function
        problem_2(arr3, arr4);


    }
}
