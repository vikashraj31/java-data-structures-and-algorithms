package Array;

public class Sub_Array {


    public static void Total_SubArray(int n[]){
        int no_of_subArray =0;
        for(int i =0 ; i<n.length-1; i++){
            int current = n[i];
            for(int j =i+1; j<n.length-1; j++){
                System.out.print("["+current+ ","+ n[j]+ "]");
            }
            System.out.println();
        }
    }
    


    public static void main(String[] args) {
        int array [] = {2,3,4,2,1,5};

        Total_SubArray(array);
    }
}
