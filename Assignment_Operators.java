public class Assignment_Operators {
    public static void main(String[] args) {
        int x=12,y=23,z=10,a;

        System.out.println(x); // 12

        a=x; // here, x=12
        System.out.println(a); // 12

        System.out.println(y); // 23

        y=z; // here, y=23 and z=10
        System.out.println(y); // 10

        System.out.println(z); // 10

        z+=x;  // here, z=10 and x=12
        System.out.println(z); // 22

        a-=10;
        System.out.println(a); // 2

        x/=z; // here, z=22 and x=12
        System.out.println(x); // 0

        y%=3; // here, y=10
        System.out.println(y); // 1

        x+=10; // here, x=0
        System.out.println(x); // 10

        x*=100; // here, x=10
        System.out.println(x); // 1000

        z*=a;//  here z=22 and a=2
        System.out.println(z); // 44
    }
}
