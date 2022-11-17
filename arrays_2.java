import java.util.Arrays;

public class arrays_2 {

    // This function is to print all elements of an array
    public static void print_array(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println("\n");
    }



    public static void main(String[] args) {

        /* We can copy an array to another array. But the adders of original array is copied. Therefore,
           on changing in copied array, the changing takes place in original array */
        /* It is called 'Array Referencing' and the copied array is
           called 'Referenced array' */

        // Original array
        int[] arr1 = {10,20,30,40,50,60};

        // Copied array
        int[] arr2 = arr1;

        System.out.println("Without using any method ");
        System.out.println("Elements of both arrays before changing two elements of copied array ");
        System.out.print("Elements of original array: ");
        print_array(arr1);
        System.out.print("Elements of copied array: ");
        print_array(arr2);

        // Changing in copied array
        arr2[0] = 1;
        arr2[3] = 0;

        System.out.println("Elements of both arrays after changing two elements of copied array ");

        System.out.print("Elements of original array: ");
        print_array(arr1);

        System.out.print("Elements of copied array: ");
        print_array(arr2);



        /* We can create a copy of an array with different memory storage
           using this method --> .clone(). Thus, on changing in copied array, the changing
           does not take place in original array  */
        /* It is called 'Cloning Array' and the copied array is called 'Cloned Array' */

        // Original array
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10};

        // Copied array
        int[] arr4 = arr3.clone();

        System.out.println("Using clone method ");
        System.out.println("Elements of both arrays before changing two elements of copied array ");
        System.out.print("Elements of original array: ");
        print_array(arr3);
        System.out.print("Elements of copied array: ");
        print_array(arr4);

        // Changing in copied array
        arr4[0] = 100;
        arr4[3] = -100;

        System.out.println("Elements of both arrays after changing two elements of copied array ");

        System.out.print("Elements of original array: ");
        print_array(arr3);

        System.out.print("Elements of copied array: ");
        print_array(arr4);



        // Original array
        int[] arr5 = {1,2,3,4,5,6,7,8,9,10};

        // Copied array
        int[] arr6 = Arrays.copyOf(arr5, 6);

        System.out.println("Using 'copyOf' method ");
        System.out.println("Elements of both arrays before changing two elements of copied array ");
        System.out.print("Elements of original array: ");
        print_array(arr5);
        System.out.print("Elements of copied array: ");
        print_array(arr6);

        // Changing in copied array
        arr6[0] = 1;
        arr6[3] = -1;

        System.out.println("Elements of both arrays after changing two elements of copied array ");

        System.out.print("Elements of original array: ");
        print_array(arr5);

        System.out.print("Elements of copied array: ");
        print_array(arr6);



        // Original array
        int[] arr7 = {1,2,3,4,5,6,7,8,9,10};

        // Copied array
        int[] arr8 = Arrays.copyOfRange(arr7 , 4 , 9);

        System.out.println("Using 'copyOfRange' method ");
        System.out.println("Elements of both arrays before changing two elements of copied array ");
        System.out.print("Elements of original array: ");
        print_array(arr7);
        System.out.print("Elements of copied array: ");
        print_array(arr8);

        // Changing in copied array
        arr8[0] = 10;
        arr8[3] = -10;

        System.out.println("Elements of both arrays after changing two elements of copied array ");

        System.out.print("Elements of original array: ");
        print_array(arr7);

        System.out.print("Elements of copied array: ");
        print_array(arr8);

    }
}
