import java.util.Scanner;
import java.util.Random;
public class Math_Class {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -11;
        double z = Math.sin(y);
        System.out.println(z);


        // we have a lot of methods in Math method such as:
        // Math.max
        // Math.min
        // Math.sqrt (square root)
        // Math.abs (absolute)
        // Math.sin
        // etc..

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((x*x)+(y*y));
        System.out.println(z);

        // Random
        Random random = new Random();
                    

        int x_ = random.nextInt();

        System.out.println(x_);
    }
}
