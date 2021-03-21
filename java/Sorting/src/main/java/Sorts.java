/**
 *
 */
public class Sorts {
    public static <T extends Comparable<? super T>> void selectionSort(T[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            swap(a, i, min);
        }
    }

    private static <T extends Comparable<? super T>> void swap(T[] a, int i, int j) {
        T temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * Elementary sort that builds a final array one element at a time by moving
     * current element to it's proper position in a partially sorted array.
     * <p>
     * ~N^2/4 runtime on average for a random array. Worse case N^2/2. Best case
     * N - 1 for sorted array
     *
     * @param a   input array
     * @param <T> Comparable
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] a) {
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j > 0 && a[j].compareTo(a[j - 1]) < 0; j--) {
                swap(a, j, j - 1);
            }
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] a) {
    }

    public static <T extends Comparable<? super T>> void quickSort(T[] a) {
    }

    public static <T extends Comparable<? super T>> void heapSort(T[] a) {
    }

    public static <T extends Comparable<? super T>> void countSort(T[] a) {
    }

    public static <T extends Comparable<? super T>> void bucketSort(T[] a) {
    }
}
