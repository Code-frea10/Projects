import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter your number");
        int data = scanner.nextInt();

        System.out.println("Your number is: " + data);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int data_ = input.nextInt();
        Scanner input_ = new Scanner(System.in);
        System.out.println("Enter a Number again: ");
        int data_1 = input_.nextInt();

        System.out.println("Your number is : "+data_+","+ + data_1);

        int x;
        int y;
        int result;
        Scanner cal = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        x = cal.nextInt();

        Scanner cal_ = new Scanner(System.in);
        System.out.println("Enter a Number again");
        y = cal_.nextInt();

        result = x + y;

        System.out.println("Your Value was: " + result);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int age = s.nextInt();

        if(age >= 18 && age < 30) {
            System.out.println("You Have Access");
        }else if (age > 30) {
            System.out.println("Sorry");
        }

        else {
            System.out.println("Access Denied");

        }
    }
}
