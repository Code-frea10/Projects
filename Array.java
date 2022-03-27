public class Array {
    public static void main(String[] args) {

        // Array
        // Array is a collection of multiple values in a Single Variable with the Same DataType they are governed by using an index.
        // Declaring w/ values
        String[] sports= {
                "Chess","Soccer", "Billiard"
        };
        sports[2]= "Baseball";
        System.out.println(sports[2]);
        System.out.println(sports.length);

        // Declaring w/o values
        int[] number_counts = new int[4];
        number_counts[0] = 5;
        System.out.println(number_counts[0]);
        number_counts[1] = 6;
        System.out.println(number_counts[1]);
        number_counts[2] = 5;
        System.out.println(number_counts[2]);
        number_counts[3] = 3;
        System.out.println(number_counts[3] + number_counts[2]); // 8(3+ 5)

       String[] studentSubjects = new String[5];
       studentSubjects[0] = "Computer Science";
       studentSubjects[1] = "Computer Engineering";
       studentSubjects[2] = "Information Technology";
       studentSubjects[4] = "Mathematics";

       System.out.println(studentSubjects.length);
       System.out.println(studentSubjects[2]);
       System.out.println(studentSubjects[3]); // null


        String[] cars = {
                "Toyota",
                "Mercedes-Benz",
                "Tesla"
        };

        cars[0] = "Isuzu";

        System.out.println(cars[0]);

        String[] sports_ = new String[3];

        sports_[0] = "chess";
        sports_[1] = "soccer";
        sports_[2] = "basketball";

        System.out.println(sports_[0]);

        for (String sport : sports) {
            System.out.println(sport);
        }

        // 2d Arrays
        String[][] studentNames = new String[3][3];

        studentNames[0][0] = "John";
        studentNames[0][1] = "Paul";
        studentNames[0][2] = "Joshua";
        studentNames[1][0] = "Michel";
        studentNames[1][1] = "Jemima";
        studentNames[1][2] = "Allen";
        studentNames[2][0] = "Adella";
        studentNames[2][1] = "Alvin";
        studentNames[2][2] = "Amara";

        for (String[] studentName : studentNames) {
            System.out.println();
            for (String s : studentName) {
                System.out.println(s);
            }
        }

        // 2d array
        String[][] users = {
                {"Joshua", "joshua123"},
                {"Paul", "paul123"},
                {"Michael", "michael123"},
                {"Mark", "mark123"}
        };

        // declaring 2d array
        // datatype identifier[][] = new datatype[rows][cols]
        // Example:
//        int student_numbers[] = new int[4][2]

    }
}
