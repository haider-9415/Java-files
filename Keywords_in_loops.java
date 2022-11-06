public class Keywords_in_loops {
    public static void main(String[] args) {

        // Break keyword
        int num1=1;
        while (true){
            if (num1%5==0 && num1%7==0){
                System.out.println("First +ve multiple of 5 and 7 = "+num1);
                break;
            }
            num1++;

        }



        // Continue keyword
        for (int num2 = 1; num2 <= 50 ; num2++) {
            if (num2%3==0) {
                continue;
            }
            System.out.print(num2+",");
        }




        // to print only odd numbers between 1 and 100
        System.out.println("The odd numbers are:");
        for (int i = 1; i <=100 ; i++) {
            if (i%2 == 0){
                continue;
            }
            System.out.print(i+",");
        }


        // to print multiples of 7 in between 1 and 100
        System.out.println("The multiples of 7 in between 1 and 100 are:");
        for (int i = 1; i <= 100 ; i++) {
            if (i%7 != 0){
                continue;
            }
            System.out.print(i+",");
        }



    }

}
