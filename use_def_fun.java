import first.pack.maths;

class algebra {
    //a method
    int add(int a, int b){
        int ans=a+b;
        System.out.println(a + " + " + b + " = " + ans);
        // return value6
        return ans;
    }

    static int sub(int a,int b){
        int ans=a-b;
        System.out.println(a+" - "+b+" = "+ ans);
        return ans;
    }


}

public class use_def_fun {
    static void state(){
        System.out.println("Welcome To Physics Wallah");
    }

    public static void main(String[] args) {

//        algebra obj1=new algebra();  // to create an object of the function
//
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter first number");
//        int x= sc.nextInt();
//        System.out.println("Enter second number");
//        int y=sc.nextInt();
//
//        obj1.add(x,y); // here we have called a method using an object of the class 'add'


//        state(); // you can see, we have used the function without creating the object because we have used 'static' keyword


//        algebra.sub(10,5); // here we have called a method using its classname




    }
}