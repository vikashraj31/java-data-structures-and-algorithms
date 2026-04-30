package Pattern;

public class diamond {

    public static void Diamond(int n){
        // Top
        for(int i = 1; i <= n; i++){ // outer loop

            for(int j = 1; j <= n - i; j++){ // For space
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i)-1; k++){ // star
                System.out.print("*");
            }
            System.out.println();
        }

        // Bottom
        for(int i = n - 1; i >= 1; i--){

            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k <= (2*i)-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Diamond(7);
    }
}