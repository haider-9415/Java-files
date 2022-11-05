import java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // to print first n natural no.
        System.out.println("Enter the no.");
        int n1= sc.nextInt();
        int num1=1;
        do {
            System.out.println(num1);
            num1++;
        }while (num1 <= n1);



        // in this loop, first iteration always gets printed
        System.out.println("Enter the no.");
        int n2= sc.nextInt();
        int num2=1;
        do {
            System.out.println(num2);
            num2++;
        }while (num1 >= n2); // here only 1 will be output

    }
}
