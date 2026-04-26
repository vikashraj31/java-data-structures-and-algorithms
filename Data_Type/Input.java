package Data_Type;
import java.util.Scanner;


public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Integer
        System.out.print("Enter int: ");
        int i = sc.nextInt();

        // Long
        System.out.print("Enter long: ");
        long l = sc.nextLong();

        // Float
        System.out.print("Enter float: ");
        float f = sc.nextFloat();

        // Double
        System.out.print("Enter double: ");
        double d = sc.nextDouble();

        // Byte
        System.out.print("Enter byte: ");
        byte b = sc.nextByte();

        // Short
        System.out.print("Enter short: ");
        short s = sc.nextShort();

        // Boolean
        System.out.print("Enter boolean (true/false): ");
        boolean bool = sc.nextBoolean();

        // Word input
        System.out.print("Enter a word: ");
        String word = sc.next();

        // Clear buffer before nextLine
        sc.nextLine();

        // Full line input
        System.out.print("Enter a full sentence: ");
        String line = sc.nextLine();

        // Output all values
        System.out.println("\n--- Output ---");
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("boolean: " + bool);
        System.out.println("word: " + word);
        System.out.println("line: " + line);

        sc.close();
    }
}
    

