import Access_Spesifiers.*;
import org.w3c.dom.ls.LSOutput;

public class for_check {

    public static void main(String[] args) {
        for_specifiers object1 = new for_specifiers();

        System.out.println(object1.method1("it is outside of the package."));

        // protected method can not be access outside the package
//        for_specifiers object2 = new for_specifiers();
//        System.out.println(object2.method2("it is protected method, outside the package"));


        // private method can not be access outside the package
//        for_specifiers object3 = new for_specifiers();
//        System.out.println(object3.method3("it is private class, outside the package"));


        // default method can not be access outside the package
//        for_specifiers object4 = new for_specifiers();
//        System.out.println(object4.method4("it is default method , outside the package"));

    }
}
