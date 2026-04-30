package Array;

public class Binary_search {

    public static int FindKey(int a[], int key) {
        int start = 0;
        int end = a.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (a[mid] == key) {
                return mid;
            }

            if (a[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8};

        System.out.println("Key Found at " + FindKey(arr, 5));
    }
}