public class Unary_Operators {
    public static void main(String[] args) {
        int x=10,y=10,z,a=10;

        System.out.println(y++);   // 10 because it is pre-increment
        System.out.println(y);     // 11

        System.out.println(++x);   // 11 because it is pre-increment
        System.out.println(x);     // 11

        z=a++;
        System.out.println(z);     // 10 due to post-increment but here a=11

        int num1=5,num2=10;

        System.out.println(num1--); // 5
        System.out.println(--num2); // 9

        int num3=--num1;
        System.out.println(num3);   // 3 here num1=4

        int num4=num2--;
        System.out.println(num4);   // 9 because it is post-decrement




    }
}
