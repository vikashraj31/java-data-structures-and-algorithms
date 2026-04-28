package Function;

public class Palindrome {

    public static void check(int n){
        int original = n;
        int reverse = 0;

        while(n > 0){
            int last = n % 10;
            reverse = reverse * 10 + last;
            n = n / 10;
        }

        if(original == reverse)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        check(31183);
    }
}