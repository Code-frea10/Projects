public class Expressions {
    public static void main(String[] args) {
        int students = 10;
        students++;
        System.out.println(students);

        int pizzaSlices = 10;
        int person_Eats = 3;
        int result = pizzaSlices % person_Eats;
        System.out.println(result);

        int employee = 10;
        int i = employee * 4;
        System.out.println(i);

        // probably the answer for this is 1.000... because int don't hold float nor double
//        int friends = 10;
//        friends = friends / 3;
//        System.out.println(friends);

        // to fix this:

//        // this is OK
//        double friends = 10;
//        friends = (double) friends % 3;
//        System.out.println(friends);

        // this is Very Good
        double friends = 10;
        friends = (float) friends % 3;
        System.out.println(friends);





    }
}
