import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

      //Question-1
      System.out.println("Enter your name");
      String name=scan.nextLine();
      System.out.println("Enter your roll number");
      int roll=scan.nextInt();
      System.out.println("Enter your field of interest");
      String field=scan.next();
      System.out.println("Name: "+name+", Roll number: "+roll+", Field of interest: "+field);

      // Question-2
      System.out.println("write any word");
      String first=scan.next();
      System.out.println("Enter another word");
      String second=scan.next();
      System.out.println("You have written: "+first+second);

        // Question-3
        System.out.println("Enter your marks in math");
        int m1= scan.nextInt();
        System.out.println("Enter your marks in physics");
        int m2= scan.nextInt();
        System.out.println("Enter your marks in computer science");
        int m3= scan.nextInt();
        int total=(m1+m2+m3);
        System.out.println("Total marks: "+total);
        System.out.println("Percentage: "+ (total*100)/300+"%");


    }
}
