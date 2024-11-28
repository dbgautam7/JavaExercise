public class Main {
    int x = 10;
    int modelYear;
    String modelName;

    public Main(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();
        Main obj = new Main(2013, "Parado");
        System.out.println(obj.modelName + obj.modelYear);
        obj.myPublicMethod();
        System.out.println(obj.x);
    }

}
