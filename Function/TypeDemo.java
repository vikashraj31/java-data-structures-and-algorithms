package Function;

public class TypeDemo {
    public static void main(String[] args) {

        // Type Conversion (automatic)
        int a = 10;
        double b = a;   // int → double

        System.out.println("Conversion: " + b);

        // Type Casting (manual)
        double x = 10.9;
        int y = (int) x;   // double → int

        System.out.println("Casting: " + y);
    }
}