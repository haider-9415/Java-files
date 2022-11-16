import java.util.Scanner;

public class Problems {
    Scanner sc = new Scanner(System.in);

    /* Problem 1 */
    /* Calculate the sum of given array */
    void Problem_1(){

        int[] arr1 = {123,43,76,77,98,97,56,199,300};

        int sum=0; // in this variable, we will add values of the array

        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        System.out.println("Sum of the values of array arr1 = "+sum+"\n");

    }

    /* Problem 2 */
    /* Find the greatest and least values in a given array */

    void problem_2(){
        int[] arr2 = {1,9,2,8,4,7,10,0,-1,34,-100,-101,101,1046373,-75764};

        // to find greatest value
        int ans1 = 0;
        for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] > arr2[ans1]){
                ans1 = i;
            }
        }
        System.out.println("The greatest value = "+arr2[ans1]);

        // to find least value
        int ans2 = 0;
        for (int i = 1; i < arr2.length; i++) {

            if (arr2[i] < arr2[ans2]){
                ans2 = i;
            }
        }
        System.out.println("The least value = "+arr2[ans2]+"\n");
    }


    /* Problem 3 */
    /* check an integer 'x' is in the array or not, if it is then print its 'index no.'
       and if it not then print 'not found' */

    void Problem_3(){

        int[] arr3 = {34,5,4,8,7,6,1,9};

        int ans = -1;
        System.out.print("Enter an integer: ");
        int num1 = sc.nextInt();
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] == num1){
                ans = i;
                break;
            }
        }
        if (ans == -1 ){
            System.out.println(" Not found ");
        }
        else {
            System.out.println(" Index no. of "+num1+" = "+ans);
        }
    }



    public static void main(String[] args) {

        Problems obj1 = new Problems();

        obj1.Problem_1();

        obj1.problem_2();

        obj1.Problem_3();

    }
}
