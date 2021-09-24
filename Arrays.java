public class Arrays {

    public void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // here we will keep two pointers start and end and these two travel along side
    // and swap the numbers
    public void reverseWithPosition(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public void minimumValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        System.out.println("minimum value is " + min);
    }

    // the j pointer will keep track of value 0 and i will traverse the array, when
    // i is non zero and j is zero a swap is done
    public void moveZeroes(int[] arr, int n) {
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0) {
                j++;
            }
        }
    }

    public int[] resizearray(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        return temp;
    }

    public void isStringPalindrome(String word) {
        char[] charArray = word.toCharArray();
        char[] reverse = new char[charArray.length];
        int start = 0;
        int end = charArray.length-1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[start] == charArray[end]) {
                start++;
                end--;
            } else {
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("a palindrome");
    }

    public void arrayDemo() {
        int[] arr = new int[5];
        arr[0] = 0;
        arr[1] = 3;
        arr[2] = 0;
        arr[3] = 4;
        arr[4] = 6;
        printArray(arr);
        reverseArray(arr);
        reverseWithPosition(arr, 0, 3);
        printArray(arr);
        minimumValue(arr);
        moveZeroes(arr, arr.length);
        printArray(arr);
        System.out.println("original size of array is " + arr.length);
        arr = resizearray(arr, 10);
        System.out.println("now the size of array is " + arr.length);
        isStringPalindrome("that");
    }

    public static void main(String[] args) {
        Arrays a = new Arrays();
        a.arrayDemo();
    }
}
