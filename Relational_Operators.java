public class Relational_Operators {
    public static void main(String[] args) {
        int num1=20,num2=20,num3=30;

        System.out.println(num1+" = "+num2+": "+ (num1==num2));

        System.out.println(num1+" != "+num2+": "+ (num1!=num2));

        System.out.println(num1+" = "+num3+": "+ (num1==num3));

        System.out.println(num1+" != "+num3+": "+ (num1!=num3));

        System.out.println(num3+" > "+num2+": "+ (num3>num2));

        System.out.println(num3+" < "+num1+": "+ (num3<num1));

        System.out.println(num1+" <= "+num2+": "+ (num1<=num2));

        System.out.println(num3+" >= "+num2+": "+ (num3>=num2));

        System.out.println(num3+" <= "+num1+": "+ (num3<=num1));

    }
}
