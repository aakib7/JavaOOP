import java.util.Scanner;
public class DataInput {
    public static void main(String[] args) {

        // formate specifier (with printf)
        // String name = "Aakib";
        // int age = 20;
        // double height = 5.9;
        // Boolean status = true;
        // System.out.printf("Name=%s, Age=%d, Height=%.2f, Status=%b\n", name, age, height, status);
        // System.out.printf("Name=%s, Age=%d, Height=%10.2f, Status=%b\n", name, age, height, status);
        // System.out.printf("Name=%s, Age=%7d, Height=%-10.2f, Status=%b\n", name, age, height, status);
        // // height 10.2f --> 10 --> consume 10 characters place
        // // -10.2f --> 10 --> consume 10 characters place left align
        // // Age also consume area of 7 chacter .
        // // in table we got differet vlaue we specify height it came in line

        // // concatenation
        // System.out.println("Name = " + name);
        // System.out.println("Name = " + name + " Age " + age);

        // int number = 20;
        // System.out.println("Sum="+number+40); // here concatenation precendence is high so Sum=20 became a string and than Sum=2040 is also a string
        // System.out.println("Sum=" + (number + 40));

        ///////////////////User Input///////////////////
        Scanner input = new Scanner(System.in);
        int number1=0;
        System.out.println("Enter a Number1:");
        number1 = input.nextInt();
        System.out.println("first number: "+number1);
        System.out.println("Enter Second Number:");
        int secondNumber = input.nextInt();
        System.out.println("second number: " + secondNumber);
        //nextFloat(),nextDouble(),nextBoolean(),nextLine(),next()
        // after numeric scan if u want to scan a string use input.nextLine()

        

    }

}
