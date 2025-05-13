package algorithms.sorting;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] arr = {11, 1, 2, 12, 3, 13, 4, 14, 5, 15};
        System.out.println(
                "----------------------------------------------------------\n\n" +
                        "Selection Sort\n" +
                        "Array before sorting: " + Arrays.toString(arr) +
                        "\n\n----------------------------------------------------------"
        );

        SelectSortImpl sorter = new SelectSortImpl();
        sorter.selectSort(arr);

        System.out.println("Sorted array " + Arrays.toString(arr));
    }
}

class SelectSortImpl {

    void selectSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            System.out.println(
                    "\n\n----------------------------------------------------------\n" +
                            "Iteration " + i + "; initial min_index = " + minIndex + "\n" +
                            "Array before iteration: " + Arrays.toString(arr)
            );

            for (int j = i + 1; j < n; j++) {
                System.out.print(
                        "j = " + j + "; arr[j] = " + arr[j] + "; current min = " + arr[minIndex]
                );

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                    System.out.println(" - Found new min at index " + minIndex);
                } else {
                    System.out.println(" - No change");
                }
            }

            if (minIndex != i) {
                System.out.println(
                        "\nSwapping arr[" + i + "] = " + arr[i] + " with arr[" + minIndex + "] = " + arr[minIndex]
                );
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            } else {
                System.out.println("\nNo swap needed for iteration " + i);
            }

            System.out.println(
                    "Array after iteration:  " + Arrays.toString(arr) +
                            "\n----------------------------------------------------------\n"
            );
        }
    }
}
