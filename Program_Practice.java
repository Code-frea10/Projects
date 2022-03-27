import java.util.Scanner;

public class Program_Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lives = 3;
        String answer;


        while (lives > 0) {
            System.out.println("Who created Java Programming?: ");
            System.out.println("Answer: ");
            answer = scanner.nextLine();
            answer = "James Gosling";

            if (answer.equals(answer)) {
                System.out.println(answer.equalsIgnoreCase(answer));
                System.out.println("Great");
                break;
            } else {
//                System.out.println(answer.equals(""));
                System.out.println("Wrong");
                lives--;
            }
        }




    }
}
