import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a no.");
        int num1= sc.nextInt();

        if ((num1%2)==0){
            System.out.println("You entered an even no.");
        }
        else {
            System.out.println("You entered an odd no.");
        }
    }
}
