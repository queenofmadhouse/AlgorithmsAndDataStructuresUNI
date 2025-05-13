package algorithms.searching;

import java.util.Arrays;

public class LinearSearch {

    public static void main(String[] args) {

        int[] arr = {11, 1, 2, 12, 3, 13, 4, 14, 5, 15};
        int target = 13;

        System.out.println(
                "----------------------------------------------------------\n\n" +
                        "Linear Search\n" +
                        "Array: " + Arrays.toString(arr) +
                        "\nTarget: " + target +
                        "\n\n----------------------------------------------------------\n\n"
        );

        LinearSearchImpl searcher = new LinearSearchImpl();
        int resultIndex = searcher.linearSearch(arr, target);

        if (resultIndex != -1) {
            System.out.println("\nResult: Element found at index " + resultIndex);
        } else {
            System.out.println("\nResult: Element not found");
        }
    }
}

class LinearSearchImpl {

    int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            System.out.println(
                    "----------------------------------------------------------" +
                            "\nIteration " + i +
                            "\nChecking index " + i + ": arr[" + i + "] = " + arr[i]
            );

            if (arr[i] == target) {
                System.out.println(
                        "Found target " + target + " at index " + i +
                                "\n----------------------------------------------------------"
                );
                return i;
            } else {
                System.out.println(
                        "arr[i] = " + arr[i] + "   !=  target = " + target + "  -> Continue searching" +
                                "\n----------------------------------------------------------\n"
                );
            }
        }

        System.out.println("Element not found in the array.");
        return -1;
    }
}
