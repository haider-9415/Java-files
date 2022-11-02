import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number");
        int num1=sc.nextInt();
        // 'sc' is the object which we created, and we have to use different methods to take values of different types as input
        System.out.println("You entered: "+num1);

        System.out.println("Enter your name");
        String name1=sc.next(); // it is used when ,in your input, there is no whitespace
        System.out.println("Your name is: "+ name1);

        System.out.println("Enter your name");
        String name2=sc.nextLine(); // it is used when ,in your input, there is whitespace
        System.out.println("Your name is: "+ name2);

        System.out.println("Enter a character");
        char ch1=sc.next().charAt(0);  // '.charAt(index no.)' is used to take character as input
        System.out.println("The character: "+ch1);

        System.out.println("Enter a your father name");
        char ch2=sc.next().charAt(3);  // using '.charAt(index no.)', we have printed forth character of a string ,because, index no. starts with 0
        System.out.println("Your father name: "+ch2);




    }
}
