public class arrays {

    void one_dim_arrays(){

        int[] ages = new int[5];
        String[] names = new String[5];

        // in this, we do not need to define the size of the array
        double[] weights = {12.4,45,50.0,56.123,43.0,2};

        // To insert values in the array
        ages[0]=10; ages[1]=20; ages[2]=25; ages[3]=5; ages[4]=50;

        names[0]="x"; names[1]="y"; names[2]="z"; names[3]="a"; names[4]="b";

        // to print the values of the vector
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        System.out.println(weights[0]);
        System.out.println(weights[1]);
        System.out.println(weights[2]);
        System.out.println(weights[3]);
        System.out.println(weights[4]);
        System.out.println(weights[5]);

        // To find length or no. of elements in an array
        System.out.println(ages.length);     // 5
        System.out.println(names.length);    // 5
        System.out.println(weights.length);  // 6

    }

    void two_dim_array(){


        // 2-D arrays
        String[][] students = {{"x","y","z"},{"a","b"},{"p","q","o"}};
        int[][] numbers = new int[5][3];

        // To insert the values in 'numbers' array
        numbers[0][0]=234;numbers[0][1]= 567;numbers[0][2]= 891;numbers[1][2]= 231;numbers[1][0]= 345;

        // To print there values
        System.out.println(numbers[0][0]); // 234
        System.out.println(numbers[0][1]); // 567
        System.out.println(numbers[0][2]); // 891
        System.out.println(numbers[1][2]); // 231
        System.out.println(numbers[1][0]); // 345

        System.out.println(students[0][0]); // x
        System.out.println(students[0][1]); // y
        System.out.println(students[1][0]); // a
        System.out.println(students[1][1]); // b
        System.out.println(students[2][0]); // p
        System.out.println(students[2][2]); // o

        // To find length or number of elements in an array
        System.out.println(numbers.length);  // 3 Because multi-dimensional array contains arrays as elements
        System.out.println(students.length); // 5

    }

    public static void main(String[] args) {
        arrays obj1= new arrays();

        obj1.one_dim_arrays();

        obj1.two_dim_array();

    }
}
