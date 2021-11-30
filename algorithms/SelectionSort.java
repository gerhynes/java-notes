public class SelectionSort {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = {3,1,7,2,11,4,6,-1,2,4,9};

        // Print unsorted array
        System.out.println("Unsorted array");
        printArray(arr);

        // Sort array
        sort(arr);

        // Print sorted array
        System.out.println("Sorted array");
        printArray(arr);
    }

    static void sort(int[] arr){
        // Loop over array
        for (int i = 0; i < arr.length - 1; i++){
            // Assume first element is minimum
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Compare value at current index with leftmost value (per iteration)
                // If current value is smaller, set it as new min value
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // Swap min element with first element
            // You may swap a value with itself, this is negligible
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
