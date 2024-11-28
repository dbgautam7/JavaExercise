public class App {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) throws Exception {
        myMethod();
        System.out.println("Hello World!!!");
        System.out.println("I am learning Java.");
        System.out.println("I will print on the same line.");
        // This is comment
        System.out.println(358);
        System.out.println(4 * 7);

        String name = "Java is a programming language.";
        System.out.println(name);

        int establishedDate = 2006;
        System.out.println(establishedDate);

        char studentGrade = 'B';
        System.out.println("Student grade: " + studentGrade);

        long longNum = 15000000000L;
        System.out.println(longNum);

        float floatNum = 5.75f;
        System.out.println(floatNum);

        double doubleNum = 19.99d;
        System.out.println(doubleNum);

        boolean isJavaFun = true;
        System.out.println(isJavaFun);

        double myDouble = 9.78d;
        int myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble); // Outputs 9.78
        System.out.println(myInt);

        String txt = "Java is a programming language.";
        System.out.println("The length of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(txt.indexOf("a"));
        System.out.println(txt.concat("\"Isn't it\" Right\n??"));

        if (20 > 18) {
            System.out.println("20 is greater than 18");
        }

        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        System.out.println(cars[0] + "  " + "First Car");
        for (

        String car : cars) {
            System.out.println(car);
        }

        for (int j = 0; j < 10; j++) {
            if (j == 6) {
                continue;
            }
            System.out.println(j);
        }

        Main newObj = new Main(2000, "Bolero");
        newObj.x = 100;
        System.out.println(newObj.x + " Hello");
    }
}
