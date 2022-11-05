import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to calculate sum of first n natural no.
        System.out.println("Enter a natural no. n ");
        int n1= sc.nextInt();
        int sum=0;

        for (int i = 1; i <= n1; i++) {
            sum+=i;
        }
        System.out.println("Sum of first "+n1+" natural numbers is"+sum);


        // to calculate factorial of natural no. n
        System.out.println("Enter the no. n");
        int n2=sc.nextInt();
        int fact=1;

        for (int i = 1; i <= n2 ; i++) {
            fact*=i;
        }
        System.out.println(n2+"!"+" = "+fact);



        // to print first n natural no. in reverse order
        System.out.println("Enter the no. n");
        int n3 = sc.nextInt();

        System.out.println("Reverse order of first "+n3+" natural numbers is");
        for (int i = n3; i >= 1 ; i--) {
            System.out.println(i);
        }



        // to print first n even natural numbers
        System.out.println("Enter an even natural no.");
        int n4 = sc.nextInt();

        if (n4%2 == 0) {
            System.out.println("even natural numbers in first " + n4 + " natural numbers are");
            for (int i = n4; i >= 0; i -= 2) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("You did not entered an even no.");
        }



        // to find odd natural numbers in first n natural numbers
        System.out.println("Enter an odd natural no.");
        int n5 = sc.nextInt();

        if (n5 % 2 != 0){
            System.out.println("odd natural numbers in first " + n4 + " natural numbers are");
            for (int i = n5; i >= 1; i -= 2) {
                System.out.println(i);
            }
        }
        else {
            System.out.println("Enter did not entered an odd natural number");
        }

    }
}
