public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = new int[10];

        int[] arr = {3,-1,7,4,2,9,2,11,8};

        // Loop over and print unsorted array
        System.out.println("Unsorted array: ");
        printArray(arr);

        // Call mergeSort method
        mergeSort(arr, arr.length);

        // Loop over and print sorted array
        System.out.println("Sorted array: ");
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int len){
        // If array is empty or has one element, consider it sorted
        if(len < 2){
            return;
        }

        // Find midpoint of array
        int mid = len/2;

        // Split the array into two temporary arrays
        int[] leftArr = new int[mid];
        int[] rightArr = new int[len-mid];

        // Loop over the left half of the array
        // Populate the left temporary array
        for (int i = 0; i < mid; i++) {
            leftArr[i] = arr[i];
        }

        // Loop over the right half of the array
        // Populate the right temporary array
        for (int i = mid; i < len; i++) {
            rightArr[i - mid] = arr[i];
        }

        // Call mergeSort recursively on both the left and right temporary arrays
        mergeSort(leftArr, mid);
        mergeSort(rightArr, len - mid);

        // Merge the left and right array
        merge(arr, leftArr, rightArr, mid, len-mid);
    }

    public static void merge(int[] arr, int[] leftArr, int[] rightArr, int left, int right){
        // Create variables to track current index in left, right and final (merged) array
        int i = 0;
        int j = 0;
        int k = 0;

        while(i < left && j < right){
            System.out.println("i=" + i + " j=" + j + " k=" + k);
            if(leftArr[i] <= rightArr[j]){
                // Set value in left array into final array
                arr[k] = leftArr[i];
                // Increment final array index
                k++;
                // Increment left array index
                i++;
            } else {
                // Set value in right array into final array
                arr[k] = rightArr[j];
                // Increment final array index
                k++;
                // Increment right array index
                j++;
            }
        }

        // Copy remaining elements of leftArr, if any
        while (i < left){
            arr[k] = leftArr[i];
            // Increment final array index
            k++;
            // Increment left array index
            i++;
        }

        // Copy remaining elements of rightArr, if any
        while(j < right){
            arr[k] = rightArr[j];
            // Increment final array index
            k++;
            // Increment right array index
            j++;
        }
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print blank line to separate arrays
        System.out.println();
    }
}
