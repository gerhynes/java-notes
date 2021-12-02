public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3,1,7,2,11,4,6,-1,2,4,9};

        // Print unsorted array
        System.out.println("Unsorted array");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        // Print sorted array
        System.out.println("Sorted array");
        printArray(arr);
    }

    static void quickSort(int[] arr, int low, int high){
        if(low < high){
            int p = partition(arr, low, high);

            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = (low - 1);

        for(int j = low; j <= high -1; j++){
            if(arr[j] < pivot){
                i++;
                // Swap values
                swap(arr, i, j);
            }
        }
        swap(arr, i+ 1, high);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void printArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
