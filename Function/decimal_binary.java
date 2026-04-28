package Function;

public class decimal_binary {

    public static void Decimal(int n ){
        int pow =0;
        int BinaryNo = 0;

        while(n>0){

            int rem = n % 2;
            BinaryNo = BinaryNo + (rem * (int)Math.pow(10, pow));
            pow++;
            n=n/2; // remove last digit 
        }
        System.out.println(BinaryNo);

    }

    public static void main(String[] args) {
        Decimal(12);
    }
    
}
