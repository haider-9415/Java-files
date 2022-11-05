import java.util.Scanner;

public class Conditional_Operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // AND Operator
        System.out.println("Enter a number that is divisible by 2 and both 5");
        int num1= sc.nextInt();

        if (num1%2==0 && num1%5==0){
            System.out.println("Good \n");
        }
        else {
            System.out.println("The number is not divisible by both 2 and 5 \n ");
        }


        // Ternary Operator
        System.out.println("Enter a no. that is divisible by 2, 3 and 4");
        int num2= sc.nextInt();

        String num3= (num2%2==0 && num2%3==0 && num2%4==0) ? "Good":"it is not divisible by 2, 3 and 4";
        System.out.println(num3);


        // 'Or' Operator
        System.out.println("Enter 10, 20 or 30");
        int num4= sc.nextInt();
        if (num4==20 || num4==10 || num4==30){
            System.out.println("correct");
        }
        else {
            System.out.println("incorrect");
        }

    }
}
