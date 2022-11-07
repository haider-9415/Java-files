import java.util.Scanner;

public class Con_Dec_Bin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter an integer");
        int num1 = sc.nextInt();
        int power1=1,x1=0,binary1=0,num2=num1;

        // Using for loop
        for (int i = 1; i <= num1 ; num1/=2) {
            x1=num1%2; // to find reminder
            binary1+= x1*power1;
            power1*=10;
        }
        System.out.println("Using for loop: its binary form = "+binary1);



        // Using while loop
        int x=0,power2=1,binary2=0;
        while (x<=num2){

            x=num2%2;
            binary2+= x*power2;
            power2*=10;
            num2/=2;
        }
        System.out.println("Using while loop: its binary form = "+binary2);
    }
}
