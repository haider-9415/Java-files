import java.util.Scanner;

public class if_else_if_statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter Your age");
        int num1 = sc.nextInt();

        if (num1<=12){
            System.out.println("You are a child");
        }
        else if (num1>12 && num1<18) {
            System.out.println("You are a teenager");
        }
        else {
            System.out.println("You are an adult");
        }
    }
}
