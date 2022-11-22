import my_methods.*;

import java.util.Scanner;

public class Problems_3 {

    /* Problem 1 */
    /* To find no. of pairs in the array whose is equal to the given number 'x' */
    public static void problem1(int[] array, int x){
        int no_of_pairs=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j] == x){
                    no_of_pairs++;
                }
            }
        }
        System.out.println("No. of pairs = "+no_of_pairs);
    }



    /* Problem 2 */
    /* Find number of triplets which sum is equal to the given number 'x' */
    public static void problem2(int[] array, int x){
        int no_of_pairs=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                for (int k = j+1; k < array.length ; k++) {
                    if (array[i]+array[j]+array[k] == x){
                        no_of_pairs++;
                    }
                }
            }
        }
        System.out.println("No. of pairs = "+no_of_pairs);
    }




    /* Problem 3 */
    /* find unique number(s) in the given array if some elements are twice */
    /* It is called 'array manipulation' */
    public static void problem3(int[] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] == array[j]){

                    array[i] = array[j] = -1;
                }
            }
        }
        // to print the unique elements
        System.out.print("Unique element(s): ");
        for (int k = 0; k < array.length; k++) {
            if (array[k] != -1){
                System.out.print(array[k]+",");
            }
        }
    }



    /* Problem 4 */
    /* Find second-largest element in the given array */
    public static void problem4(int[] array){

        // to find largest element
        int max = Integer.MIN_VALUE;// it is the min. value of integer in java
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max){
                max = array[i];
            }
        }
        // to manipulate largest element
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max){
                array[i]=Integer.MIN_VALUE;
            }
        }
        // to find second-largest element
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max2){
                max2 = array[i];
            }
        }
        System.out.println("Second largest element = "+max2);
    }




    /* Problem 5 */
    /* Return the first value that is repeating in the given array if any digit are not
       repeating then return 'not found' */
    public static void problem5(int[] array){
        int ans = -1;
        outer:for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if (array[i] == array[j]){
                    ans = array[i];
                    // here we can use "return array[i]", because return statement stops whole function
                    System.out.println("First repeating element = "+ans);
                    break outer;
                }
            }
        }
        // or "return -1"
        if (ans == -1){
            System.out.println("Not found");
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        input_output obj1 = new input_output();


        // Problem 1
        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr1 = new int[n1];
        obj1.input(arr1 ,n1);
        System.out.println("Enter x: ");
        int x = sc.nextInt();
        problem1(arr1, x);



        // Problem 2
        System.out.print("Enter the size of the array: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr2 = new int[n2];
        obj1.input(arr2 ,n2);
        System.out.println("Enter x: ");
        int x2 = sc.nextInt();
        problem2(arr2, x2);



        // Problem 3
        System.out.print("Enter the size of the array: ");
        int n3 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr3 = new int[n3];
        obj1.input(arr3 ,n3);
        problem3(arr3);



        // Problem 4
        System.out.print("Enter the size of the array: ");
        int n4 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr4 = new int[n4];
        obj1.input(arr4 ,n4);
        problem4(arr4);



        // Problem 5
        System.out.print("Enter the size of the array: ");
        int n5 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr5 = new int[n5];
        obj1.input(arr5 ,n5);
        problem5(arr5);



    }

}
