package Pattern;  
/*
   *****
   *   *
   *   *
   *****
   R =1 or 4
   C=1  or 4
 */

public class hollow {

    public static void hollow_rectangle(int R , int C){

        for(int i =1 ; i<=R;i++){
            for(int j =1 ; j<=C;j++){
                if(i == 1 || i == R || j == 1 || j ==C){
                    System.out.print("*");
                }else{
                    System.out.print(" " );
                }
                
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4,8);
    }
    
}
