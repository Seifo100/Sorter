public class Sorter {
	public static void main(String[] args) {
        int[] arr1 = {64, 25, 12, 22, 11};
            sortselect(arr1);
            System.out.println("Sorted array:");
            for (int i : arr1) {
                System.out.print(i + " ");
            }
            int[] arr2 = {12, 11, 13, 5, 6};
        System.out.println("");
        sortinsert(arr2);

        System.out.println("Sorted array:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        }
        public static void sortselect(int[] arr) {
            selectionSort(arr);
        }

    
    public static void selectionSort(int[] arr) {
        int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        // Swap the found minimum element with the element at index i
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}
public static void sortinsert(int[] arr) {
            insertionSort(arr);
        }
public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}
