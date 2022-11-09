// If we use 'public' access modifiers with class student then it will give error
class student{
    int rollno;
    String name;
}
// If we change the name of this file then it will give error
public class main {
    public static void main(String[] args) {

        // now we will create first object of the class student
        student obj1= new student();

        // now we will assign values to the attributes of the class student for first object
        obj1.rollno=100;
        obj1.name="Hanzala";

        System.out.println("Roll no.: "+obj1.rollno);
        System.out.println("Student name: "+obj1.name);

        // we will create second object of the class student
        student obj2= new student();

        // now we will assign values to the attribute of the class for second object
        obj2.rollno=101;
        obj2.name="Abdullah";

        System.out.println("Roll no.: "+obj2.rollno);
        System.out.println("Student name: "+obj2.name);


        /* You can observe why a class is called blueprint.
           We have created more than one object of a class student
           which have same properties ,i.e., attributes. */



    }

}
