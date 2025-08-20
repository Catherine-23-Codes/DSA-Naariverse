import java.util.Arrays;

public class SecondLargest1 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};

        Arrays.sort(arr);  // sort array in ascending order
        int n = arr.length;

        // find second largest (ignoring duplicates)
        int largest = arr[n - 1];
        int secondLargest = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }

        if (secondLargest == -1) {
            System.out.println("No second largest element.");
        } else {
            System.out.println("Second largest element is: " + secondLargest);
        }
    }
}
