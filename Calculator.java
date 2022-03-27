import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int number;
        int number_;
        char operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operation: (+,-,*,/)");
        operation = scanner.next().charAt(0);

        System.out.println("Enter a Number: ");
        number = scanner.nextInt();

        System.out.println("Enter again a number: ");
        number_ = scanner.nextInt();

        if (operation == '+') {
            System.out.println("Result: " + ((number + number_)));
        }

        if (operation == '-') {
            System.out.println("Result: " + ((number - number_)));
        }

        if (operation == '*') {
            System.out.println("Result: " + ((number * number_)));
        }

        if (operation == '/') {
            System.out.println("Result: " + ((number / number_)));
        }
    }
}
