import java.util.Scanner;

public class Pattern_Problems {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        //  rectangular pattern
//        System.out.println("Enter no. of rows");
//        int row1=sc.nextInt();
//        System.out.println("Enter no. of columns");
//        int col1=sc.nextInt();
//        for (int i = 1; i <= row1 ; i++) {
//            for (int j = 1; j <= col1 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }




        // hollow rectangle
//        System.out.println("Enter no. of rows");
//        int row2= sc.nextInt();
//        System.out.println("Enter no. of columns");
//        int col2=sc.nextInt();
//        for (int i = 1; i <= row2 ; i++) {
//            for (int j = 1; j <=col2 ; j++) {
//                if (i==1 || i==row2 || j==1 || j==col2){
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }



        // triangle
//        System.out.println("Enter no. of rows");
//        int row3= sc.nextInt();
//        for (int i = 1; i <= row3 ; i++) {
//            for (int j = 1; j <= i ; j++) {  // here j<=1, because no. of rows = no. of columns
//                System.out.print("*");
//            }
//            System.out.println();
//        }




        // reversed triangle
//        System.out.println("Enter no. of rows");
//        int row4=sc.nextInt();
//
//        for (int i = 1; i <=row4 ; i++) {
//            for (int j = row4; j >= i ; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



        // pyramid pattern
//        System.out.println("Enter a +ve integer ");
//        int row5=sc.nextInt();
//        for (int i = 1; i <= row5 ; i++) {
//            // to print spaces
//            for (int j = 1; j <= row5-i; j++) {
//                System.out.print(" ");
//            }
//            // to print stars
//            for (int k = 1; k <= 2*i-1 ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }




        // to print reversed pyramid
//        System.out.println("Enter a +ve integer");
//        int num1=sc.nextInt();
//        int copy=num1;
//        for (int i = 1; i <= num1 ; i++) {
//            //to print spaces
//            for (int j = 1; j <= i-1  ; j++) {
//                System.out.print(" ");
//            }
//            // to print stars
//
//            // when input is even
//            if (num1%2==0) {
//                for (int k = 1; k < copy * 2 - copy; k++) {
//                    System.out.print("*");
//                }
//                copy -= 2;
//                System.out.println();
//            }
//            // when input is odd
//            else {
//                for (int k = 1; k <= copy * 2 - copy; k++) {
//                    System.out.print("*");
//                }
//                copy -= 2;
//                System.out.println();
//            }
//        }



        // number pattern in reversed triangular form
//        System.out.println("Enter a +ve integer");
//        int num2=sc.nextInt();
//        for (int i = 1; i <= num2 ; i++) {
//            for (int j = i; j <= num2 ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }




        // number pattern in rectangular patteren in specific form
//        System.out.println("Enter a +ve integer");
//        int num2=sc.nextInt();
//        for (int i = 1; i <= num2 ; i++) {
//            for (int j = i; j <= num2; j++){
//                System.out.print(j);
//            }
//            for (int k = 1; k <= i-1 ; k++) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }



        // number pattern in rectangular form
//        System.out.println("Enter no. of rows");
//        int num3=sc.nextInt();
//        System.out.println("Enter no. of columns");
//        int num4= sc.nextInt();
//        for (int i = 1; i <= num3; i++) {
//            for (int j = 1; j <= num4 ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }



        // number pattern in hollow ractangular form
//        System.out.println("Enter no. of rows");
//        int num5 = sc.nextInt();
//        System.out.println("Enter no. of columns");
//        int num6 = sc.nextInt();
//        for (int i = 1; i <= num5 ; i++) {
//            for (int j = 1; j <= num6 ; j++) {
//                if (i==1 || j==1 || i==num5 || j==num6){
//                    System.out.print(j);
//                }
//                else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
        
        
        
        // another number pattern

        /* to print such patterns, you can observe that if
        ' no. of a row + no. of a column ' is even then one gets printed otherwise another number */

//        System.out.println("Enter no. of rows");
//        int num7=sc.nextInt();
//        System.out.println("Enter no. og columns");
//        int num8=sc.nextInt();
//        for (int i = 1; i <= num7 ; i++) {
//            for (int j = 1; j <= num8 ; j++) {
//                if ((i+j)%2==0){
//                    System.out.print(1);
//                }
//                else {
//                    System.out.print(2);
//                }
//            }
//            System.out.println();
//        }



        // number pattern in triangular form

//        System.out.println("Enter a +ve no.");
//        int num9 = sc.nextInt();
//        for (int i = 1; i <= num9 ; i++) {
//            for (int j = 1 ; j <= i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


    }
}
