import java.util.Scanner;

/* we will use this package to use 'input' method to take values for an array */
import my_methods.*;

public class Problems_2 {


    /* Problem 1 */
    /* Find the last occurrence of an element 'x' in given array */
    public static void problem_1(int[] array , int x){
        int occurrence = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x){
                occurrence = i;
//                break; // To find first occurrence of the 'x', we use break keyword.
            }
        }
        System.out.print("The last occurrence of "+x+" is at index: "+occurrence);
        System.out.println("\n");
    }




    /* Problem 2 */
    /* Find number of occurrence of an element 'x' in the given array */
    public static void problem_2(int[] array , int x){
        int count = 0;
        for (int i = 0; i < array.length; i++) {

            if (array[i] == x){
                count++;
            }
        }
        System.out.println("occurrence of element '"+x+"' = "+count+"\n");
    }




    /* Problem 3 */
    /* count number of elements greater than an integer 'x' */
    public static void problem_3(int[] array, int x){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > x ){
                count++;
            }
        }
        System.out.println("Number of elements greater than "+x+" = "+count+"\n");
    }




    /* Problem 4 */
    /* Check the elements of the given array is in ascending order or not */
    public static void problem_4(int[] array){
        String ans = "It is in ascending order ";
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i-1]){
                ans = "It is not in ascending order ";
                break;
            }
        }
        System.out.println(ans+"\n");
    }




    /* Problem 5 */
    /* Check the elements of the given array is in descending order or not */
    public static void problem_5(int[] array){
        String ans = "It is in descending order ";
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]){
                ans = "It is not in descending order ";
                break;
            }
        }
        System.out.println(ans+"\n");
    }




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        input_output obj1 = new input_output();



        /* Problem 1 */
        System.out.print("Enter the size of the array: ");
        int n1  = sc.nextInt();
        System.out.println("Enter values for the array");
        int[] arr1 = new int[n1];

        // To take elements of the array 'arr1'
        obj1.input(arr1,n1);

        System.out.print("Enter the x: ");
        int x1 = sc.nextInt();
        // to call the function
        problem_1( arr1 , x1 );



        /* Problem 2 */
        System.out.print("Enter the size of the array: ");
        int n2  = sc.nextInt();
        System.out.println("Enter values for the array");
        int[] arr2 = new int[n2];

        // To take elements of the array 'arr2'
        obj1.input(arr2,n2);

        System.out.print("Enter the x: ");
        int x2 = sc.nextInt();
        // to call the function
        problem_2( arr2 , x2 );



        /* Problem 3 */
        System.out.print("Enter the size of the array: ");
        int n3  = sc.nextInt();
        System.out.println("Enter values for the array");
        int[] arr3 = new int[n3];

        // To take elements for the array 'arr3'
        obj1.input(arr3,n3);

        System.out.print("Enter the x: ");
        int x3 = sc.nextInt();
        // to call the function
        problem_3( arr3 , x3 );



        /* Problem 4 */
        System.out.print("Enter the size of the array: ");
        int n4  = sc.nextInt();
        System.out.println("Enter values for the array");
        int[] arr4 = new int[n4];

        // To take elements for the array 'arr3'
        obj1.input(arr4,n4);

        // to call the function
        problem_4( arr4 );



        /* Problem 5 */
        System.out.print("Enter the size of the array: ");
        int n5  = sc.nextInt();
        System.out.println("Enter values for the array");
        int[] arr5 = new int[n5];

        // To take elements for the array 'arr3'
        obj1.input(arr5,n5);

        // to call the function
        problem_5( arr5 );

    }


}
