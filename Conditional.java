public class Conditional {
    public static void main(String[] args) {
        //if and else
        // conditional statements
        int time = 13;
        if(time >= 6 && time < 12) {
            System.out.println("Good Morning");
        } else if (time > 12 && time < 18) {
            System.out.println("Good Afternoon");
        } else {
            System.out.println("Good Evening");
        }

        int age = 20;
        if(age >= 22){
            System.out.println("You are Allowed");
        } else if (age <= 20) {
            System.out.println("OK");
        }else {
            System.out.println("Sorry");
        }

        // switches (statement that allow a variable to be tested for equality against a list of values )

        int day = 4;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;
        }

    }
}
