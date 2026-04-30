package Array;

public class LargestSmallestValue {

    public static int Largest(int Array[]){
        int largest = Integer.MIN_VALUE;

        for(int i = 0; i < Array.length; i++){
            if(Array[i] > largest){
                largest = Array[i];
            }
        }
        return largest;
    }

    public static int Smallest(int Array[]){
        int small = Integer.MAX_VALUE;

        for(int i = 0; i < Array.length; i++){
            if(Array[i] < small){
                small = Array[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        int Array[]= {2,5,3,7,0};

        System.out.println("Smallest No " + Smallest(Array));
        System.out.println("Largest No " + Largest(Array));
    }
}