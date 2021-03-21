import java.util.Arrays;

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
        // O(N) pass to put smallest element in position to serve as sentinel
        for (int i = a.length - 1; i > 0; i--) {
            if (a[i].compareTo(a[i - 1]) < 0) {
                swap(a, i, i - 1);
            }
        }

        for (int i = 2; i < a.length; i++) {
            T value = a[i];
            int j = i;
            while (value.compareTo(a[j - 1]) < 0) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = value;
        }
    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] a) {
        T[] aux = Arrays.copyOf(a, a.length);
        mergeSortHelper(a, aux, 0, a.length - 1);
    }

    private static <T extends Comparable<? super T>> void mergeSortHelper(T[] a, T[] aux, int low, int high) {
        if (high <= low) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSortHelper(a, aux, low, mid);
        mergeSortHelper(a, aux, mid + 1, high);
        merge(a, aux, low, mid, high);
    }

    private static <T extends Comparable<? super T>> void merge(T[] a, T[] aux, int low, int mid, int high) {
        int i = low;
        int j = mid + 1;

        if (high + 1 - low >= 0) {
            System.arraycopy(a, low, aux, low, high + 1 - low);
        }

        for (int k = low; k <= high; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > high) {
                a[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) < 0) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
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
