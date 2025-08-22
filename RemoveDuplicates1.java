public class RemoveDuplicates1 {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0; // index of last unique element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i]; 
            }
        }
        return j + 1; // number of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int n = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

