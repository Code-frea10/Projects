import java.util.Scanner;

public class My_Projects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int user_input;
        int user_input_;
        char operation;

        System.out.println("Enter an operation: (+, -, *, /, %)");
        operation = scanner.next().charAt(0);

        System.out.println("Enter your first Number: ");
        user_input = scanner.nextInt();

        System.out.println("Enter your second Number: ");
        user_input_ = scanner.nextInt();

        // Logic
        while (user_input + user_input_ != 0 ) {
            if (operation == '+') {
                System.out.println(user_input + user_input_);
            } else  if (operation == '-') {
                System.out.println(user_input - user_input_);
            } else  if (operation == '*') {
                System.out.println(user_input * user_input_);
            } else if (operation == '/') {
                System.out.println(user_input / user_input_);
            } else if (operation == '%') {
                System.out.println(user_input + user_input_);
            }
            else  {
                System.out.println("Error - Please Enter a valid Number/Operation :");
            }

            if (user_input + user_input_ != 0);
            break;
        }

    }

}

