import java.util.Scanner;
import javax.swing.JOptionPane;
public class Projects {
        public static void main(String[] args){
            System.out.println("Hello, World");

            int number;
            int number_;
            char operation;

            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose an operator: (+, -, *, /)");
            operation = scanner.next().charAt(0);

            System.out.println("Please input a number: ");
            number = scanner.nextInt();

            System.out.println("Please input again a number: ");
            number_ = scanner.nextInt();

            if (operation == '+') {
                System.out.println("Result :" + ((number + number_)));
            }

            if (operation == '-') {
                System.out.println("Result :" + ((number - number_)));
            }

            if (operation == '*') {
                System.out.println("Result :" + ((number * number_)));
            }

            if (operation == '/') {
                System.out.println("Result :" + ((number / number_)));
            }


        }

}
