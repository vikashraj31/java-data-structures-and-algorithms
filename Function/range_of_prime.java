package Function;

public class range_of_prime {

    public static void isPrime(int n){
        if (n <= 1) return;

        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return;
            }
        }
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 199;

        for(int i = 2; i <= n; i++){
            isPrime(i);
        }
    }
}