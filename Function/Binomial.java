package Function;

/*
formula n!/r!(n-r)!
 */

public class Binomial {

    public static int Factorial(int n){
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * i;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;

        int diff = n - r;

        int N = Factorial(n);
        int R = Factorial(r);
        int D = Factorial(diff);

        float F = (float) N / (R * D); 
        System.out.println(F);
    }
}