import java.util.Scanner;
public class Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose what do you want to convert: ");
        System.out.println("1). PHP to USD");
        System.out.println("2). PHP to JPY");
        System.out.println("3). PHP to DKK");

        int exchange = scanner.nextInt();

        switch (exchange) {
            case 1:
                System.out.println("Enter in Peso: ");
                double php = scanner.nextDouble();

                if (php >= 0 || php == 0) {
                    System.out.println(php + " Your value was: " + php*0.019 + "USD");
                } else {
                    System.out.println("Please Enter a valid value");
                }

                break;

            case 2:
                System.out.println("Enter in Peso: ");
                double jpy = scanner.nextDouble();

                if (jpy >= 0 || jpy == 0) {
                    System.out.println(jpy + " Your value was: " + jpy*2.27 + "JPY");
                } else {
                    System.out.println("Please Enter a valid value");
                }
                break;

            case 3:
                System.out.println("Enter in Peso: ");
                double dkk = scanner.nextDouble();

                if (dkk >= 0 || dkk == 0) {
                    System.out.println(dkk + " Your value was: " + dkk*0.13 + "DKK");
                } else {
                    System.out.println("Please Enter a valid value");
                }

        }
    }
}
