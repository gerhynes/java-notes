class MergeSort {
    public static void main(String args[]) {
        // Initialize array
        int arr[] = { 12, 7, -3, 5, 9, 4 };

        // Loop over and print unsorted array
        System.out.println("Unsorted Array");
        printArray(arr);

        // Sort array
        sort(arr, 0, arr.length - 1);

        // Loop over and print sorted array
        System.out.println("Sorted array");
        printArray(arr);
    }

    // Sort arr[first...last] using merge()
    static void sort(int arr[], int first, int last)
    {
        if (first < last) {
            // Find the middle point
            int mid = first + (last-first)/2;

            // Sort left and right halves
            sort(arr, first, mid);
            sort(arr, mid + 1, last);

            // Merge the sorted halves
            merge(arr, first, mid, last);
        }
    }

    // Merges two subarrays of arr
    // First subarray is arr[first...mid]
    // Second subarray is arr[mid+1...last]
    static void merge(int arr[], int first, int mid, int last)
    {
        // Find the lengths of two subarrays to be merged
        int len1 = mid - first + 1;
        int len2 = last - mid;

        // Create temp arrays
        int leftArr[] = new int[len1];
        int rightArr[] = new int[len2];

        // Copy data to temp arrays
        for (int i = 0; i < len1; ++i)
            leftArr[i] = arr[first + i];
        for (int j = 0; j < len2; ++j)
            rightArr[j] = arr[mid + 1 + j];

        // Merge the temp arrays

        // Initial indexes of first and second subarrays
        int i = 0;
        int j = 0;

        // Initial index of merged subarray array
        int k = first;

        // Add values to merged array in order
        while (i < len1 && j < len2) {
            // If leftArr value greater, add to sorted array
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            }
            // If rightArr value greater, add to sorted array
            else {
                arr[k] = rightArr[j];
                j++;
            }
            // Increment sorted array index
            k++;
        }

        // Copy remaining elements of leftArr, if any
        while (i < len1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements of rightArr, if any
        while (j < len2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    // Method for looping over and printing array
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

