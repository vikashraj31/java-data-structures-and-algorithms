package Function;

public class binary_Decimal {

    public static void convert(int binary){

        int pow = 0;
        int dec = 0;

        while(binary > 0){
            int lastdigit = binary % 10;

            dec = dec + (lastdigit * (int)Math.pow(2, pow));

            pow++;
            binary = binary / 10;  // remove last digit
        }

        System.out.println("Decimal = " + dec);
    }

    public static void main(String[] args) {
        convert(101);
    }
}