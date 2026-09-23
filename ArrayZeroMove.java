public class ArrayZeroMove{
    public static void main(String[] args){
        int[] arr = {0, 1, 0, 3, 12};

        int j = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Fill the remaining positions with zero
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

        // Print the array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}