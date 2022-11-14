public class constructor {
        int a;
        int b;
        constructor(int x, int y){
            System.out.println("It is the constructor of class math2");
            // here we have assigned 'a' by 'x' and 'b' by 'y'
            a=x;
            b=y;
        }
        int add(){
            int ans = a+b;
            return ans;
        }
        int sub(){
            int ans = a-b;
            return ans;
        }


    public static void main(String[] args) {

        constructor obj1 = new constructor(20,10);
        System.out.println("Following results have been printed using first object ");
        System.out.println(obj1.add());
        System.out.println(obj1.sub());



        System.out.println("Following results have been printed using second object ");
        constructor obj2 = new constructor(10,20);
        System.out.println(obj2.add());
        System.out.println(obj2.sub());

        /* You can observe that from passing the values to the parameters of a constructor
           we can use them in multiple methods */
    }
}
