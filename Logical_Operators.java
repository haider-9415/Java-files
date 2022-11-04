public class Logical_Operators {
    public static void main(String[] args) {
        int x=10,y=20,z=30;

        System.out.println(x<y && x<z);    // true

        System.out.println(x>y && x<z);    // false

        System.out.println(y<x && x>z);    // false

        System.out.println(y<z || z>x);    // true

        System.out.println(x>y || x>z);    // false

        System.out.println(x<y || y>z);    // true

        System.out.println(!(x<y && x<z)); // false

        System.out.println(!(x<y && x>z)); // true

        System.out.println(!(x>z));        // true

        System.out.println(!(z>y));        // false

    }
}
