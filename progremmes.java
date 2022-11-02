import java.util.Scanner;

public class progremmes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // program to calculate basic operations of mathematics
        System.out.println("Enter first integer");
        int num1= sc.nextInt();
        System.out.println("Enter second integer");
        int num2= sc.nextInt();
        int sum= num1+num2;
        int diff= num1-num2;
        int prod=num1*num2;
        int div=num1/num2;
        System.out.println( num1+" + "+num2+" = "+sum);
        System.out.println( num1+" - "+num2+" = "+diff);
        System.out.println( num1+" * "+num2+" = "+prod);
        System.out.println( num1+" / "+num2+" = "+div);

        // program to take in put for giving simple interest
        System.out.println("Enter principle");
        float p= sc.nextFloat();
        System.out.println("Enter rate of interest");
        float r= sc.nextFloat();
        System.out.println("Enter time ");
        float t= sc.nextFloat();
        float si= (p*r*t)/100;
        System.out.println("Principle: "+ p);
        System.out.println("Rate: "+ r);
        System.out.println("Time: "+ t);
        System.out.println("Simple Interest: "+ si);

    }
}
