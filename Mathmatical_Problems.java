import java.util.Scanner;

public class Mathmatical_Problems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // To count digits in a given natural number
        System.out.println("Enter a +ve integer ");
        long n1= sc.nextLong();
        long copy1 = n1;
        long num1=0;
        for (int i = 1; i <= n1 ; n1/=10) {
            num1+=1;
        }
        System.out.println("Number of digits in "+copy1+" = "+num1);



        // to calculate sum of digits in a given +ve integer

        System.out.println("Enter a +ve integer");
        long n2= sc.nextLong();
        long copy2=n2,n3=n2;
        long sum1=0,sum2=0;

        // using for loop
        for (int i = 1; i <=n2 ; n2/=10) {
            sum1+=(n2%10);
        }
        System.out.println("The sum of digits of "+copy2+", using for loop, = "+sum1+"\n");

        // using while loop
        while (n3>0){
            sum2+=n3%10;
            n3/=10;
        }
        System.out.println("The sum of digits of "+copy2+", using while loop, = "+sum1);



        // to print a =ve integer in reversed order

        System.out.println("Enter a +ve integer");
        long n4=sc.nextLong();
        long num2,num3;
        long n5=n4;
        System.out.print("Using for loop, the reversed order of "+n4+" = ");
        for (int i = 1; i <= n4 ; n4/=10) {
            num2 = n4%10;
            System.out.print(num2);
        }
        System.out.println("\n");

        System.out.print("Using while loop, the reversed order of "+n5+" = ");
        while (n5>0){
            num3= n5%10;
            System.out.print(num3);
            n5/=10;
        }


        // to calculate sum of series 1-2+3-4+5.......n

        System.out.println("Enter a number n");
        int n6=sc.nextInt();
        int sum3=0;
        for (int i = 1; i <= n6 ; i++) {
            if (i%2==0){
                sum3-=i;
            }
            else {
                sum3+=i;
            }
        }
        System.out.println("sum of series 1-2+3-4+.......n, where n is "+n6+" = "+sum3);



        // to find n!

        // to print in ascending order
        System.out.println("Enter a +ve integer n");
        long n7= sc.nextLong();
        long fact=1,n8=n7;
        System.out.print("In ascending order \n "+n7+"! = ");
        for (int i = 1; i <= n7 ; i++) {
            System.out.print(i);
            fact*=i;
            if (i==n7){
                System.out.print(" = ");
            }
            else {
                System.out.print(" x ");
            }
        }
        System.out.println(fact);

        // to print n! in descending order
        long fact2=1;
        System.out.print("In descending order \n "+n8+"! = ");
        for (long i = n8; i >= 1 ; i--) {
            System.out.print(i);
            fact2 *= i;
            if (i == 1) {
                System.out.print(" = ");
            }
            else {
                System.out.print(" x ");
            }
        }
        System.out.println(fact2);



        // to find factorial of first 'n' natural numbers

        System.out.println("Enter the no. n ");
        long n9= sc.nextLong();
        long fact3=1;
        for (int i = 1; i <= n9 ; i++) {
            fact3*=i;
            System.out.println(i+"! = "+fact3);
        }



        // to find 'a' to the power 'b'

        // using for loop
        System.out.println("Enter base");
        int n10= sc.nextInt();
        System.out.println("Enter power");
        int n11= sc.nextInt();
        int power1=1;

        for (int i = 1; i <= n11 ; i++) {
            power1*=n10;
        }
        System.out.println("Using for loop");
        System.out.println(n10+" to the power "+n11+" = "+power1+"\n");

        // using while loop
        int power2=1,i=1;
        while (i <= n11){
            power2*=n10;
            i++;
        }
        System.out.println("Using while loop");
        System.out.println(n10+" to the power "+n11+" = "+power1);

    }
}
