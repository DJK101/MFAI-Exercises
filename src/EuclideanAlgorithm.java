import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 0;

        for (int i = 0; i < 2;) {

            System.out.println("Please enter a Natural Number: ");
            if (in.hasNextInt() && i == 0) {
                a = in.nextInt();
                System.out.println("Entered 'a' value! " + a + System.lineSeparator());
                i++;
            } else if (in.hasNextInt() && i == 1) {
                b = in.nextInt();
                System.out.println("Entered 'b' value! " + b + System.lineSeparator());
                i++;
            } else {
                System.out.println("Invalid Input!");
                in.next();
            }
        }

        if (a > b) {
            System.out.println("Formatted inputs, continuing process..." + System.lineSeparator());
        } else if (a == b) {
            System.out.println("a and b are equal, therefore the greatest common divisor is " + a);
            System.exit(0);
        } else {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("Formatted inputs, continuing process..." + System.lineSeparator());
        }

        int input1 = a;
        int input2 = b;

        // Calculate number of remainders


        while (input1 % input2 != 0) {

            int r = input1 % input2;
            input1 = input2;
            input2 = r;

        }
        System.out.println("Greatest Common Divisor of " + a + " and " + b + " is: " + input2);
    }
}