/**
 *
 */
public class Sorts {
    public static <T extends Comparable<? super T>> void mergeSort(T[] a) {
    }

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

    public static <T extends Comparable<? super T>> void quickSort(T[] a) {
    }

    public static <T extends Comparable<? super T>> void heapSort(T[] a) {
    }

    public static <T extends Comparable<? super T>> void countSort(T[] a) {
    }

    public static <T extends Comparable<? super T>> void bucketSort(T[] a) {
    }
}
