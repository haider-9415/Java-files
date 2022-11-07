import java.util.Scanner;

public class Con_Bin_Dec {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using for loop

        System.out.println("Enter a binary no.");
        int num1 = sc.nextInt();
        int power1=1,decimal=0,x=0,num2=num1;
        for (int i = 1; i <= num1 ; num1/=10) {
            x = num1 % 10;  // % assign in num1 unit digit after every
            decimal += (x*power1);
            power1*=2;
        }
        System.out.print("Using for loop: ");
        System.out.println("Its decimal form = "+decimal);




        // in while loop

        int n=1,power2=1,x1=0;
        int decimal2 = 0;

        while (n <= num2){
            x= num2%10;
            decimal2 += x*power2;
            power2*=2;
            num2/=10;
        }
        System.out.print("Using while loop: ");
        System.out.println("Its decimal form = "+decimal2);
    }
}
