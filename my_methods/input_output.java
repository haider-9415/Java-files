package my_methods;

import java.util.Scanner;

public class input_output {
    Scanner sc = new Scanner(System.in);

    // To take values for an array
    public void input(int[] array, int size){

        for (int i = 0; i < size; i++) {

            array[i] = sc.nextInt();
        }
    }


    public void output(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println("\n");
    }
}
