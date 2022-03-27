import java.util.Scanner;
public class Scope {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Enter a Number: ");
            number = scanner.nextInt();
        }

        while (!(number <= 9));
        System.out.println("OK");
    }
}
