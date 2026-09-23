public class RemoveDuplicate {
    public static void main(String[] args) {

        int[] arr = {1, 1, 2, 2, 3, 4, 4};

        int i = 0;

        for (int j = 1; j < arr.length; j++) {

            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // Number of unique elements
        int k = i + 1;

        // Print unique elements
        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}

