public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,2,4,1,6,8,3};

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
        // Loop over array from second element
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;

            // Compare key with sorted elements
            // Move elements greater than key one position to the right
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
