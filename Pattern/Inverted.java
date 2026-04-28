package Pattern;

/*  

        *
       **
      ***


*/

public class Inverted {

    public static void Print(int R , int C){

        for(int i =1 ; i<=R;i++){
            for(int j =1 ; j<=R-i; j++){
                System.out.print(" ");
            }
            for(int k =1 ; k<i;k++){
                System.out.print("*");
            }
          System.out.println();
           
        }
    }

    public static void main(String[] args) {
        Print(4, 4);
    }
    
}
