package Function;

public class prime {
    
    public static void print(int n){

        for(int i = 2; i <= n - 1; i++){
            if(n % i == 0){
                System.out.println("Not a Prime Number");
                return; // because of this return program end 
            }
        }

        System.out.println("It is a Prime Number");
    }

    public static void main(String[] args) {
        print(4);
    }
}