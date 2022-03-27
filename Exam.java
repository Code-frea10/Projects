// import java.security.SecureRandom;
// import java.sql.SQLOutput;
//import java.util.Objects;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exam {
    public static void main(String[] args) {

//        String answer_;

    // call the quiz method

//        question1();
        question2();
        question3();
        question4();
    }


//    private static void question1() {
//        // object variables
//            char answer_;
//            String choice;
//            int lives_ = 3;
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What's the old name of Java before its was called Java? (A. JavaScript\" + \"B. Scala\" + \"C. Oak\" + \"D. None of the above)");
//        System.out.println("Write you answer: ");
//
//        answer_ = scanner.next().charAt(0);
//        choice = scanner.nextLine();
//
//        if (answer_ == 'A')  {
//            System.out.println("Wrong");
//            lives_--;
//            System.out.println("Sorry, you only: " + lives_ + " lives left");
//        } else if (answer_ == 'B') {
//            System.out.println("Wrong");
//            lives_--;
//            System.out.println("Sorry, you only: " + lives_ + " lives left");
//        } else if (answer_ == 'C') {
//            System.out.println("Correct");
//            lives_++;
//            System.out.println("Congrats you have " + lives_ + " lives :) ");
//        } else if (answer_ == 'D') {
//            System.out.println("Wrong");
//            lives_--;
//            System.out.println("Sorry, you only: " + lives_ + " lives left");
//        } else {
//            System.out.println("Please provide an answer between A-D");
//            lives_= 0;
//            System.out.println("You loose " + lives_);
//        }
//
//
//    }


    private static void question2() {
        // local variables
            int lives_= 3;
            String answer1 = JOptionPane.showInputDialog(null, "Question 2\n" +
                    "Is Java The same as Javascript? \n" +
                    "A. Yes\n" + "B. No\n" + "C. Maybe\n" + "D. None of the Above"
                );

                switch (answer1) {
                    case  "B", "b" -> {
                        lives_++;
                        System.out.println("Congrats you you have: " + lives_ + " lives");
                        JOptionPane.showMessageDialog(null, "Correct");
                        break;
                    }

                    case "A", "a", "C", "c", "D", "d" -> {
                        lives_--;
                        System.out.println("Sorry, you have: " + lives_ + " lives left");
                        // JOptionPane.showMessageDialog(null, "Wrong");
                        break;
                    }

                };

                if ((!answer1.equals("B"))) {
                    JOptionPane.showMessageDialog(null, "Wrong");
                    // System.out.println(lives_--);

                } else {
                    System.out.println("Better luck next time :-) ");
                }

    }

    private static void question3() {
        int lives1 = 3;
        String noAnswer = " ";
        String answer2 = JOptionPane.showInputDialog(null, "Question 3\n" +
                "Who developed Java programming? \n" +
                "A. Bill Gates\n" + "B. Steve Jobs\n" + "C. James Gosling\n" + "D. None of the Above" + noAnswer
        );
        switch (answer2) {
            case  "C", "c" -> {
                lives1++;
                System.out.println("Congrats you you have: " + lives1 + " lives");
                JOptionPane.showMessageDialog(null, "Correct");
                break;
            }

            case "A", "a", "B", "b", "D", "d" -> {
                lives1--;
                System.out.println("Sorry, you have: " + lives1 + " lives left");
                // JOptionPane.showMessageDialog(null, "Wrong");
                break;
            }

        };

        if ((answer2.equals("C"))) {
            JOptionPane.showMessageDialog(null, "Great");
        }

        if (answer2.equals(noAnswer)) {
            JOptionPane.showMessageDialog(null, "Try Again");
            JOptionPane.showInputDialog(null, "Question 3\n" +
                    "Who developed Java programming? \n" +
                    "A. Bill Gates\n" + "B. Steve Jobs\n" + "C. James Gosling\n" + "D. None of the Above" + noAnswer
            );
        }


    }

    private static void question4() {
        int lives2 = 3;
        String noAnswer_ = " ";
        String answer4 = JOptionPane.showInputDialog(null, "Question 4 \n" +
                    "Is HTML a programming language? \n" +
                    "A. Yes\n" + "B. No\n" +"C. Maybe\n" + "D. None of the above" + noAnswer_
                );

        switch (answer4) {
            case "B", "b" -> {
                lives2++;
                System.out.println("Congrats you have: " + lives2 + " lives left");
                JOptionPane.showMessageDialog(null, "Correct");
                break;
            }

            case "A", "a", "C","c", "D", "d" -> {
                lives2--;
                System.out.println("Sorry your answer is Wrong " + "You only have: " + lives2 + " lives left");
                JOptionPane.showMessageDialog(null, "Wrong");
                break;
            }

        }

        if ((answer4.equals("A"))) {
            JOptionPane.showMessageDialog(null, "Great");
        }

        // if the user answer blank

        if (answer4.equals(noAnswer_)) {
            JOptionPane.showMessageDialog(null, "Try Again");
            JOptionPane.showInputDialog(null, "Question 4\n" +
                    "Is HTML a programming language? " +
                    "A.Yes\n" + "B.No\n" +"C.Maybe\n" + "D. None of the above" + noAnswer_
            );
        }
    }
}
