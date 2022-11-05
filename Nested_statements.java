import java.util.Scanner;

public class Nested_statements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your percentage");
        int num1=sc.nextInt();

        if (num1<80){
            if (num1<40){
                System.out.println("Fail");
            }
            else if (num1>=40){
                System.out.println("Good");
            }
        }
        else{
            System.out.println("Excellent");
        }



        System.out.println("What is your score in previous test");
        int score= sc.nextInt();

        if (score<15){
            if (score<8){
                System.out.println("You need to work hard");
            }
            else if (score>=8){
                System.out.println("Good, but you need to work hard");
            }
        }
        else {
            System.out.println("Excellent");
        }


    }
}
