import my_methods.*;

import java.util.Scanner;

public class Problems_4 {


    /* Problem 1 */
    /* Swap two values */
    public static void problem_1(int a, int b){

        System.out.println("Values before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // to store value of 'a' in 'temp'
        int temp = a;
        // to store value of 'b' in 'a'
        a=b;
        // to store value of 'a' in 'b'
        b=temp;
        System.out.println("Values after swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }


    /* Problem 2 */
    /* Swap two values without using third variable */
    public static void problem_2(int a , int b){

        System.out.println("Values before swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        // to add 'a' by 'b'
        a += b;
        // to subtract 'b' from 'a+b' and to store original value of 'a' in 'b'
        b = a-b;
        // to subtract 'a' from 'a-b' and to store original value of 'b' in 'a'
        a -= b;
        System.out.println("Values after swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }



    /* Problem 3 */
    /* Reverse element of an array */
    public static void problem_3(int[] array , int size){
        int[] ans_array = new int[size];

        // to print original array
        System.out.println("Original array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
        int index=0; // it will be used as index no. of 'ans_array'

        // to reverse the array
        for (int i = size-1; i >= 0 ; i--) {
            ans_array[index++] = array[i];
        }

        /* We can also use this */
//        int i1=size-1, j=0;
//        while (i1>=0){
//            ans_array[j++] = array[i1--];
//        }


        /* Without creating a new array */
        /* to print it, remove 'ans_' from 'ans_array' in the loop which is for printing */
//        int j = size-1;
//        int k;
//        outer:for (int i = 0; i < size; i++) {
//            k = array[i];
//            array[i] = array[j];
//            array[j--] = k;
//            if (i > j){
//              break outer;
//            }
//        }


        // to print reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(ans_array[i]+",");
        }
    }


    /* Problem 4 /
    /* Rotate the given array by 'k' steps */
    // Method 1
    public static void problem_4_1(int[]array, int k){

        int size = array.length;
        int[] ans_array = new int[size];
        k %= size;// because , 'k' can be greater than 'size'

        int j=0;
        // to insert last 'k' elements of 'array' in beginning of 'ans_array'
        for (int i = size-k ; i <= size-1; i++) {
            ans_array[j] = array[i];
            j+=1;
        }

        // to insert first 'n-k-1' elements of 'array' in ending of 'ans_array'
        for (int i = 0; i <= size-k-1; i++) {

            ans_array[j++] = array[i];
        }

        // to print the result
        for (int i = 0; i < size; i++) {
            System.out.print(ans_array[i]+",");
        }
    }

    // Method 2
    public static void problem_4_2(int[] array, int first, int last){

        int j = last;
        int temp;
        outer:for (int i = first; i < last; i++) {
            temp = array[i];
            array[i] = array[j];
            array[j--] = temp;
            if (i > j){
                break outer;
            }
        }
    }



    /* Problem 5 */
    /* Search the given no. is present in the array or not in given queries */
    /* To return an array we have to use datatype with square brackets in declaration of a method*/
    static int[] Problem_5(int[] array){
        int[] frequency_array = new int[100005];

        // to make frequency array
        for (int i = 0; i < array.length; i++) {
            frequency_array[array[i]]++;
        }
        return frequency_array;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        input_output obj1 = new input_output();


        /* Problem 1*/
        System.out.print("Enter a: ");
        int a1 = sc.nextInt();
        System.out.print("Enter b: ");
        int b1 = sc.nextInt();
        problem_1(a1 , b1);
        System.out.println("\n");


        /* Problem 2 */
        System.out.print("Enter a: ");
        int a2 = sc.nextInt();
        System.out.print("Enter b: ");
        int b2 = sc.nextInt();
        problem_1(a2 , b2);
        System.out.println("\n");


        /* Problem 3 */
        System.out.print("Enter the size of the array: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr1 = new int[n1];
        obj1.input(arr1 ,n1);
        problem_3(arr1, n1);
        System.out.println("\n");



        /* Problem 4 */

        // using method 1
        System.out.println("Using method 1 ");
        System.out.print("Enter the size of the array: ");
        int n2 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr2 = new int[n2];
        obj1.input(arr2 ,n2);
        System.out.print("Enter k: ");
        int k1 = sc.nextInt();
        problem_4_1(arr2, k1);
        System.out.println("\n");


        // using method 2
        System.out.println("\n\nUsing method 2 ");
        System.out.print("Enter the size of the array: ");
        int n3 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr3 = new int[n3];
        obj1.input(arr3 ,n3);
        System.out.print("Enter k: ");
        int k2 = sc.nextInt();
        k2 %= n3;
        // to reverse first part
        problem_4_2(arr3, 0, n3-k2-1);
        // to reverse second part
        problem_4_2(arr3, n3-2, n3-1);
        // to reverse the reversed array
        problem_4_2(arr3, 0,n3-1);
        // to print the result
        obj1.output(arr3);
        System.out.println("\n");


        /* Problem 5 */
        System.out.print("Enter the size of the array: ");
        int n4 = sc.nextInt();
        System.out.println("Enter the elements ");
        int[] arr4 = new int[n4];
        obj1.input(arr4 ,n4);
        System.out.print("Enter no. of queries: ");
        int q = sc.nextInt();
        // to store the 'frequency_array' in 'freq' array
        int[] freq = Problem_5(arr4);

        // to check the given no. is present or not in given queries
        while (q > 0){
            System.out.print("Enter a no. to be searched: ");
            int x = sc.nextInt();

            if (freq[x] > 0){
                System.out.println("Yes");
            }else {
                System.out.println("No");
            }
            q--;
        }
        System.out.println("\n");




    }
}