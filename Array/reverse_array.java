package Array;

public class reverse_array {

    public static void Swap(int a[]) {

        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int array[] = {2,4,6,54,4,7};

        Swap(array);

        // Print reversed array
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}