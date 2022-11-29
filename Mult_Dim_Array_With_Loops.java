import java.util.Scanner;

public class Mult_Dim_Array_With_Loops {

    static void to_print(int[][] array){

        // for rows
        for (int i = 0; i < array.length; i++) {
            System.out.print("row"+i+": ");
            // for columns
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr1 = {{1,2,3,4,5},{1,2,3},{9,8,7,6,5,4,8},{1,0,3,2}};

        // we will use loops to print 2D-Array
        to_print(arr1);


        // we will use loops to insert elements of 2D-Array
        System.out.print("no. of row: ");
        int row = sc.nextInt();
        System.out.print("no. of columns: ");
        int col = sc.nextInt();

        int[][] arr2 = new int[row][col];
        System.out.println("Enter elements");
        // for rows
        for (int i = 0; i < row; i++) {
            System.out.println("For row "+i);
            // for columns
            for (int j = 0; j < col; j++) {

                arr2[i][j] = sc.nextInt();

            }
        }

        to_print(arr2);


    }
}
