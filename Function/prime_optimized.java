package Function;

public class prime_optimized {
    public static boolean P(int n) {

        if(n==2){
            return true;
        }
        for(int i =2; i<=Math.sqrt(n);i++){
            if(n%i==0)
            return false;
        }
           return true;
       
    }

    public static void main(String[] args) {
        boolean ans =P(4);
        System.out.println(ans);
    }
    
}
