package Pattern;

public class Inverted_No {

    public static void Print(int r , int c){
        int n =r;
        for(int i =1 ;i<r; i++){
            for(int j =1; j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
            n--;

        }
    }

    public static void main(String[] args) {
        Print(5, 4);
    }
    
}
