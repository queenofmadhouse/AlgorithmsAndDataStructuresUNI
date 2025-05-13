package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        Sort s = new Sort();
        int[] arr = {11, 1, 2, 12, 3, 13, 4, 14, 5, 15};
        System.out.println(
                        "----------------------------------------------------------\n\n" +
                        "Bubble Sort\n" +
                        "Array before sorting: " + Arrays.toString(arr) +
                        "\n\n----------------------------------------------------------\n\n"
        );
        s.bubbleSort(arr);
        System.out.println("Sorted array " + Arrays.toString(arr));
    }
}

class Sort {
    void bubbleSort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length; i++) {
            System.out.println(
                            "\n\n----------------------------------------------------------\n" +
                            "Iteration " + i
            );

            for (int j = 0; j < length - i - 1; j++) {
                System.out.print("j = " + j);

                if (arr[j] > arr[j + 1]) {

                    System.out.println(" - Swapping " + arr[j] + " and " + arr[j + 1]);
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    continue;
                }
                System.out.println(" - No swap");
            }
            System.out.println(
                            "Array after iteration end: " + Arrays.toString(arr) + "\n" +
                            "----------------------------------------------------------\n\n"
            );
        }
    }
}
