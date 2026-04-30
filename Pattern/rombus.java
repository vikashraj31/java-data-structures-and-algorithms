 package Pattern;
public class rombus {

    public static void rint(int R) {

        for (int i = 1; i <= R; i++) {
            for (int j = 1; j <= R - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 4; k++) {
                System.out.print("*");
            }

            System.out.println();

        }

    }

    public static void main(String[] args) {
        rint(4);
    }
}
