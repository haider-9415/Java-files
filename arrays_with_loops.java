import java.util.Scanner;

public class arrays_with_loops {

    void one_D_array() {

        int[] ages = {10, 40, 34, 56, 2, 3, 12, 34, 56, 78, 90, 90, 200, 45, 97, 76};

        // to print values of the vector we will use loops
        // it is easy way rather than we use 'sout' statement 'n' times to print 'n' elements

        // for loop
        // in this, we can print elements as we require
        System.out.print("Using for loop: ");
        for (int i = 0; i < ages.length; i++) {
            System.out.print(ages[i] + ",");
        }
        System.out.println("\n");

        // for each loop
        // in this, we have to print all elements
        System.out.print("Using for each loop: ");
        for (int age : ages) {
            System.out.print(age + ",");
        }
        System.out.println("\n");


        // while loop
        // in this also, we can print elements as we require
        System.out.print("Using while loop: ");
        int i = 0;
        while (i < ages.length) {
            System.out.print(ages[i] + ",");
            i++;
        }

    }
    void two_D_array(){

        /* We have to use 'n' no. of loops to 'n' dimensional array */

        int[][] weights= {{20,40,65,78},{100,1,999,453}};

        System.out.print("Using for loop: ");
        // this loop is for main array
        for (int i = 0; i < weights.length; i++) {
            // this loop is for element arrays of the main array
            for (int j = 0; j < weights[i].length; j++) {
                System.out.print(weights[i][j]+",");
            }
        }
        System.out.println("\n");


        String[][] names = {{"x","y","z"},{"a","b"},{"p","q","r"}};

        System.out.print("Using while loop: ");
        int i=0;
        // this loop is for main array
        while (i < names.length){
            int j=0;
            // this loop is for element arrays of the main array
            while (j < names[i].length){
                System.out.print(names[i][j]+",");
                j++;
            }
            i++;
        }

    }

    void input(){

        Scanner sc = new Scanner(System.in);
        /* We can use loops for insert values in an array */

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        System.out.println("Enter the values for the vector ");
        int[] arr1 = new int[n];
        // to take values
        for (int i = 0; i < arr1.length ; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("\n");


        System.out.print("The values of the array: ");
        // to print values
        for (int i = 0; i < arr1.length ; i++) {
            System.out.print(arr1[i]+",");
        }


    }


    public static void main(String[] args) {

        arrays_with_loops obj1 = new arrays_with_loops();

        // to call the method 'one_D_array'
        obj1.one_D_array();

        // to call the method 'two_D_array'
        obj1.two_D_array();

        // to call the method 'input'
        obj1.input();
    }
}
