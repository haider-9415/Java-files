import java.util.Scanner;
import my_methods.*;

public class Problems_6 {

    /* Problem 1 */
    /* Return an array containing the prefix sum without creating a new array */
    public static int[] problem_1(int[] array) {

        // here 'j=1', because, first elements is same in both
        for (int j = 1; j < array.length; j++) {

            array[j] += array[j-1];
        }
        return array;
    }


    /* Problem 2 */
    /* find sum from the element at index 'l' to the element at index 'r' */ 
    public static int[] problem_2(int[] array){

        for (int i = 1; i < array.length; i++) {

            array[i] += array[i-1];
        }
        return array;
    }
    
    
    /* Problem 3 */
    /* check the given array can be broken in two parts such that sums of elements of both parts are equal or not */
    public static boolean problem_3(int[] array){

        // to calculate total sum of elements of the array
        int total_sum = 0;
        for (int i = 0; i < array.length; i++) {
            total_sum += array[i];
        }

        // to calculate sum of elements of first part
        int prefix_sum = 0;
        for (int i = 0; i < array.length; i++) {
            prefix_sum += array[i];

            // sum of second part = (sum of whole array) - (sum of first part)
            int suffix_sum = total_sum - prefix_sum;
            if (suffix_sum == prefix_sum){
                // this statement stops function of the method
                return true;
            }
        }
        return false;
    }



    /* Problem 4 */
    /* Return an array containing the suffix sum without creating a new array */
    public static int[] problem_4(int[] array){

        for (int i = array.length-2 ; i >=0 ; i--) {
            array[i] += array[i+1];
        }
        return array;
    }
    


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input_output obj = new input_output();


        /* Problem 1 */
        System.out.print("Enter array size: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr1 = new int[n1];
        obj.input(arr1, n1);
        int[] array1 = problem_1(arr1);
        System.out.print("Array with suffix sum: ");
        obj.output(array1);



        /* Problem 2 */
        System.out.print("Enter array size: ");
        int n2 = sc.nextInt();
        // we have to create an array of 1-based index, therefore, size of the array is 'n2+1' and it starts from 'i=1'
        int[] arr2 = new int[n2+1];
        System.out.println("Enter elements");
        for (int i = 1; i < arr2.length ; i++) {
            arr2[i] = sc.nextInt();
        }

        // to call the function and store the array containing prefix sum
        int[] array2 = problem_2(arr2);

        System.out.print("Enter no. of queries: ");
        int q = sc.nextInt();

        while (q-- > 0){
            System.out.print("Enter first no.: ");
            int l = sc.nextInt();
            System.out.print("Enter last no.: ");
            int r = sc.nextInt();

            // the sum from 'l' to 'r' = (prefix sum to 'r') - (prefix sum to 'l-1')
            int ans = array2[r] - array2[l-1];
            System.out.println("the sum = "+ans);
        }



        /* Problem 3 */
        System.out.print("Enter array size: ");
        int n3 = sc.nextInt();
        int[] arr3 = new int[n3];
        System.out.println("Enter elements");
        obj.input(arr3, n3);
        boolean ans = problem_3(arr3);
        System.out.print("Can the array be broken? \nanswer: ");
        if (ans == true){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }




        /* Problem 4 */
        System.out.print("Enter array size: ");
        int n4 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr4 = new int[n4];
        obj.input(arr4, n4);
        int[] array3 = problem_4(arr4);
        System.out.print("Array with prefix sum: ");
        obj.output(array3);



    }
}

