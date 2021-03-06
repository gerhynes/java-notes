import java.util.Scanner;

class MergeSort {
    public static void main(String args[]) {
        // Set desired length of array
        int arrLength = 10;

        // Initialize array
        int[] arr = new int[arrLength];

        // Initialize scanner object
        Scanner scanner = new Scanner(System.in);

        // Take in numbers from user and populate array
        System.out.println("Enter " + arrLength + " numbers to populate an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        // Print unsorted array
        System.out.println("Unsorted Array");
        printArray(arr);

        // Sort array
        mergesort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted array");
        printArray(arr);
    }

    // Sort arr[leftIndex...rightIndex] using mergesort
    static void mergesort(int arr[], int firstIndex, int lastIndex)
    {
        // Check if the array contains more than one element and is unsorted
        if (firstIndex < lastIndex) {
            // Find the midpoint of the array
            int mid = (firstIndex + lastIndex)/2;

            // Sort the left and right halves of the array
            mergesort(arr, firstIndex, mid);
            mergesort(arr, mid + 1, lastIndex);

            // Merge the sorted halves
            merge(arr, firstIndex, mid, lastIndex);
        }
    }

    // Merge two subarrays of arr
    // First subarray is arr[leftIndex...mid]
    // Second subarray is arr[mid+1...rightIndex]
    static void merge(int arr[], int firstIndex, int mid, int lastIndex)
    {
        // Find the lengths of the two subarrays to be merged
        int len1 = mid - firstIndex + 1;
        int len2 = lastIndex - mid;

        // Create temporary arrays
        int leftArr[] = new int[len1];
        int rightArr[] = new int[len2];

        // Copy arr contents to temporary arrays
        for (int i = 0; i < len1; i++)
            leftArr[i] = arr[firstIndex + i];
        for (int j = 0; j < len2; j++)
            rightArr[j] = arr[mid + 1 + j];

        // =====================
        // Merge the temporary arrays
        // =====================

        // Initial indexes of first and second subarrays
        int i = 0;
        int j = 0;

        // Initial index of merged subarray array
        int k = firstIndex;

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
            k++;
        }

        // ========================
        // Copy any leftover value(s)
        // ========================

        // Copy remaining elements, if any, of leftArr into sorted array
        while (i < len1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        // Copy remaining elements, if any, of rightArr into sorted array
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