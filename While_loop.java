import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to find first n natural number
        System.out.println("Enter a natural number n ");
        int n=sc.nextInt();
        int num1=1;
        while (num1<=n){
            System.out.println(num1);
            num1++;
        }


        // to find first natural multiples of 2
        System.out.println("Enter a natural no. n ");
        int n2=sc.nextInt();
        int num2=1;
        System.out.println("first natural multiples of 2 up to "+n2+"are");
        while (num2<=n2){
            if (num2%2==0) {
                System.out.println(num2);
            }
            num2++;
        }


        // to find sum of first n natural numbers
        System.out.println("Enter a natural no. n");
        int n3= sc.nextInt();
        int num3=1,sum=0;

        System.out.println("Sum of first "+n3+" natural numbers is");
        while (num3<=n3){
            sum+=num3;
            num3++;
        }
        System.out.println(sum);



        // to add stream of +ve integers
        System.out.println("Enter the integers and to get their sum enter -1");
        int n4 = sc.nextInt();
        int sum2=0;
        while (n4 != -1) {
            sum2+=n4;
            n4 = sc.nextInt();
        }
        System.out.println("The sum = "+sum2);

    }
}
