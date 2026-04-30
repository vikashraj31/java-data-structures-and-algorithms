package Array;

public class Pairs_InArray {

    public static void pairs(int a[]) {
        int tp = 0;
        for (int i = 0; i < a.length; i++) {
            int C = a[i];

            for (int j = i + 1; j < a.length; j++) {
                // System.out.print("(" + C + "," + a[j] + ") ");

                System.out.print("(" + C + "," + a[j] + ")");

                tp++;
            }

            System.out.println();

        }
        System.out.println("Toatl pairs " + tp);
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 2, 4, 5, 6 };

        pairs(array);
    }
}