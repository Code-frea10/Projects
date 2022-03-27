public class Loop {
    public static void main(String[] args) {
        // java loops
        // in programming loops are used to repeat a block of code

        int i = 0;
        while (i <= 5) {
            System.out.println("Java is Fun");
            i++;
        }

        for(int number_ = 0; number_ < 3; ++number_){
            System.out.println("I'm working in lopping");
        }

        for (int x = 5; x <= 100; x++){
            System.out.println(x);
        }

        int sum = 0;
        for(int y = 1; y <= 100; y++ ){
            sum = sum + y;
            System.out.println("Sum: " + sum);
        }


//        for (String user = "Paul"; user != "John";){
//            System.out.println("Hello " + user); // infinite loop
//        }
//
//        for(int z = 1; z <= 4; z--) {
//            System.out.println("Infinite Loop");
//        }

        int i_ = 0;
        while (i_ != 5) {
            System.out.println("Hello, There");
            i_++;
        }

        String[] names = {"John", "Joshua", "Michael", "Paul", "Jesrael",};

        int j = 0;
        while (j < names.length) {
            System.out.println(names[j]);
            j++;
        }

        int num = 5;

        do {
            System.out.println("Hello there");
            num++;
        }while (num < 5);

        // conditions in while loop
        String[] sportsNames = {"Chess", "Basketball", "Soccer", "Baseball"};
        int num_ = 0;

        while (num_ < 5) {
            if (sportsNames[num_].equals("Chess"));
            {
                System.out.println("Hello " + sportsNames[num_].length());
                break;
            }
        }

        num_++;

        int plateNumber = 10;
        while (plateNumber <= 20) {
            System.out.println("Hi");
            plateNumber++;
        }

    }
}
