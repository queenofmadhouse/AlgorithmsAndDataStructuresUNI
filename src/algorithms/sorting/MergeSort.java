package algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {11, 1, 2, 12, 3, 13, 4, 14, 5, 15};

        System.out.println(
                "----------------------------------------------------------------------\n\n" +
                        "Merge Sort\n" +
                        "Array before sorting: " + Arrays.toString(arr) +
                        "\n\n----------------------------------------------------------------------"
        );

        MergeSortImpl sorter = new MergeSortImpl();
        sorter.sort(arr, 0, arr.length - 1);

        System.out.println(
                "\n[Main]: Sorted array: " + Arrays.toString(arr)
        );
    }
}

class MergeSortImpl {

    void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            System.out.println(
                    "\n----------------------------------------------------------------------\n" +
                            "[Sort]:  Dividing: left = " + left + ", mid = " + mid + ", right = " + right +
                            "\n----------------------------------------------------------------------"
            );

            // Sort first and second halves
            sort(arr, left, mid);
            sort(arr, mid + 1, right);

            System.out.println(
                    "\n----------------------------------------------------------------------\n" +
                            "[Sort]:  Before merge: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)) + "\n" +
                            "[Sort]:  Merging indexes: left = " + left + ", mid = " + mid + ", right = " + right +
                            "\n----------------------------------------------------------------------"
            );
            merge(arr, left, mid, right);
            System.out.println(
                    "----------------------------------------------------------------------\n" +
                    "[Sort]:  After merge: " + Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)) +
                            "\n----------------------------------------------------------------------"
            );
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        System.arraycopy(arr, left, L, 0, n1);
        System.arraycopy(arr, mid + 1, R, 0, n2);

        System.out.println(
                "[Merge]: Left part: " + Arrays.toString(L) +
                        " | Right part: " + Arrays.toString(R)
        );

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
            }
        }
        while (i < n1) {
            arr[k++] = L[i++];
        }
        while (j < n2) {
            arr[k++] = R[j++];
        }
    }
}
