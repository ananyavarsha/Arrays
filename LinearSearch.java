
public class LinearSearch {

    public static int search(int[] arr, int n, int key) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 6, 10, 7, 8, 9 };
        int item = search(arr, arr.length, 7)+1;
        if (item > 0)
            System.out.println("key found at position " + item);
        else
            System.out.println("not found");
    }
}
