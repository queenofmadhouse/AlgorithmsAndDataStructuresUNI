package algorithms.sorting;

import java.util.Arrays;

public class InsertSort {

    public static void main(String[] args) {
        int[] arr = {11, 1, 2, 12, 3, 13, 4, 14, 5, 15};

        System.out.println(
                "----------------------------------------------------------\n\n" +
                        "Insertion Sort\n" +
                        "Array before sorting: " + Arrays.toString(arr) +
                        "\n\n----------------------------------------------------------"
        );

        InsertSortImpl sorter = new InsertSortImpl();
        sorter.sort(arr);

        System.out.println("Sorted array " + Arrays.toString(arr));
    }
}

class InsertSortImpl {

    void sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;
            boolean shifted = false;  // only for console logging

            System.out.println(
                    "\n\n----------------------------------------------------------\n" +
                            "Iteration " + i + "; key = " + key + "\n" +
                            "Array before iteration: " + Arrays.toString(arr)
            );

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {

                System.out.println(
                        "j = " + j + "; arr[j] = " + arr[j] + " > key (" + key + ") - shifting " + arr[j]
                );

                arr[j + 1] = arr[j];
                j--;
                shifted = true;
            }

            if (shifted) {
                System.out.println(
                        "Placing key " + key + " at position " + (j + 1)
                );
            } else {
                System.out.println("No shifts needed for iteration " + i + "; key stays at index " + i);
            }

            arr[j + 1] = key;

            System.out.println(
                    "Array after iteration:  " + Arrays.toString(arr) +
                            "\n----------------------------------------------------------\n"
            );
        }
    }
}
