public class Multi_dimensional_array {


    public static void main(String[] args) {

        int[][] marks = new int[3][4];

        // we can insert values such that
        marks[0][0] = 45;
        marks[0][3] = 40;
        marks[1][1] = 55;
        marks[1][0] = 37;
        marks[2][2] = 52;
        marks[1][2] = 90;
        marks[2][1] = 100;
        marks[2][0] = 21;
        marks[0][2] = 799;


        double[][] rating = {
                //            col0    col1        col2    col3    col4   col5   col6
                             {1.2,     2.6,       7.965, 121.0},                          // row 0
                             {12.0,   31.99,     45.67},                                  // row 1
                             {10.01,  51.1,      66.98},                                  // row 2
                             {33.3, 1000.0001},                                           // row 3
                             {1.2,     2.3,       3.4,     4.5,   5.6,   0.6,   0.99}     // row 4
                            };
        System.out.println(rating[0][0]); // 1.2
        System.out.println(rating[0][3]); // 121.0
        System.out.println(rating[1][1]); // 31.99
        System.out.println(rating[1][2]); // 45.67
        System.out.println(rating[2][2]); // 66.98
        System.out.println(rating[0][1]); // 2.6
        System.out.println(rating[3][1]); // 1000.0001
        System.out.println(rating[4][0]); // 1.2
        System.out.println(rating[4][5]); // 0.6
        System.out.println(rating[4][2]); // 3.4






    }
}
