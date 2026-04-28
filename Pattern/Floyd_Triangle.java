package Pattern;

public class Floyd_Triangle {

    public static void Print(int r){
        int count=0;
        for(int i =1 ; i<r; i++){
            for(int j =1; j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
        

    }

    public static void main(String[] args) {
        Print(10);
    }
    
}