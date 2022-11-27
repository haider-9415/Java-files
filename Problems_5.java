import java.util.Scanner;
import my_methods.*;
public class Problems_5 {

    /* Problem 1 */
    /* Sort an array consisting of zeros and ones*/

    // Method 1
    public static void problem_1_1(int[] array){
        int count=0;
        // to count no. of occurrence of zeros
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                count++;
            }
        }
        // to store first all zeros and then ones
        for (int i = 0; i < array.length; i++) {
            if (i < count){
                array[i] = 0;
            }
            else {
                array[i] = 1;
            }
        }
    }

    // Method 2
    public static void problem_1_2(int[] array){
        int left_pointer = 0;
        int right_pointer = array.length-1;
        while (left_pointer < right_pointer){

            if (array[left_pointer] == 1 && array[right_pointer] == 0){
                array[right_pointer--] = 1;
                array[left_pointer++]  = 0;
            }
            if (array[left_pointer] == 0){
                left_pointer++;
            }
            if (array[right_pointer] == 1){
                right_pointer--;
            }
        }
    }


    /* Problem 2 */
    /* Move all even integers in beginning */
    public static void problem_2(int[] array){
        int left_pointer = 0;
        int right_pointer= array.length-1;

        while (left_pointer < right_pointer){
            // if left_pointer = odd integer and right_pointer = even integer
            if (array[left_pointer]%2!=0 && array[right_pointer]%2==0){
                // we will swap the values
                int temp = array[left_pointer];
                array[left_pointer++] = array[right_pointer];
                array[right_pointer--] = temp;
            }
            // if left_pointer = even integer(already)
            if (array[left_pointer]%2==0){
                // we will increase left_pointer only
                left_pointer++;
            }
            // if right_pointer = odd integer(already)
            if (array[right_pointer]%2!=0){
                // we will decrease right_pointer only
                right_pointer--;
            }
        }
    }


    /* Problem 3 */
    /* convert non-decreasing elements given in an array in their squares in non-decreasing order */
    public static int[] problem_3(int[] array){

        // to store squares of elements
        int[] ans = new int[array.length];
        // to use to insert the squared values
        int k = ans.length-1;

        int left_pointer = 0;
        int right_pointer = array.length-1;
        while (left_pointer <= right_pointer){

            // -ve values may be in the array. therefore
            if (Math.abs(array[left_pointer]) > Math.abs(array[right_pointer])){
                ans[k--] = array[left_pointer]*array[left_pointer];
                left_pointer++;
            }
            else {
                ans[k--] = array[right_pointer]*array[right_pointer];
                right_pointer--;
            }
        }
        return ans;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        input_output obj = new input_output();

        /* Problem 1 */
        System.out.println("Method 1:");
        System.out.print("Enter array size: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr1 = new int[n1];
        obj.input(arr1, n1);
        System.out.print("Before sorting: ");
        obj.output(arr1);
        problem_1_1(arr1);
        System.out.print("After sorting: ");
        obj.output(arr1);


        System.out.println("Method 2:");
        System.out.print("Enter array size: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr2 = new int[n2];
        obj.input(arr2, n2);
        System.out.print("Before sorting: ");
        obj.output(arr2);
        problem_1_2(arr2);
        System.out.print("After sorting: ");
        obj.output(arr2);



        /* Problem 2 */
        System.out.print("Enter array size: ");
        int n3 = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr3 = new int[n3];
        obj.input(arr3, n3);
        System.out.print("Before rearrangement: ");
        obj.output(arr3);
        problem_2(arr3);
        System.out.print("After rearrangement: ");
        obj.output(arr3);



        /* Problem 3 */
        System.out.print("Enter array size: ");
        int n4 = sc.nextInt();
        System.out.println("Enter elements in non-decreasing order");
        int[] arr4 = new int[n4];
        obj.input(arr4, n4);
        System.out.print("Before squaring: ");
        obj.output(arr4);
        // to store the resultant array
        int[] result = problem_3(arr4);
        System.out.print("After squaring: ");
        // to print 'result' array
        obj.output(result);


    }
}
