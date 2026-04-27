package Conditional;
import java.util.*;

public class check_year {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check: ");
        int a = sc.nextInt();

        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)) {
            System.out.println("This is a Leap Year");
        } else {
            System.out.println("This is not a Leap Year");
        }

        sc.close();
    }
}