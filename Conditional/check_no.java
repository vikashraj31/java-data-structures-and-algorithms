package Conditional;
import java.util.Scanner;

public class check_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number ");
        int a = sc.nextInt();

        if(a>=0){
            System.out.print("Number is Positive");
        }else{
            System.out.println("Num is Negative");
        }
    }
    
}
