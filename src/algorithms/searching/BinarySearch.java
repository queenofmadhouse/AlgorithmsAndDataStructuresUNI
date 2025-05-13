package algorithms.searching;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 11, 12, 13, 14, 15};  // NECESSARY: should be sorted!
        int target = 11;

        System.out.println(
                "----------------------------------------------------------\n\n" +
                        "Binary Search\n" +
                        "Array: " + Arrays.toString(arr) +
                        "\nTarget: " + target +
                        "\n\n----------------------------------------------------------\n\n"
        );

        BinarySearchImpl searcher = new BinarySearchImpl();
        int resultIndex = searcher.binarySearch(arr, target);

        if (resultIndex != -1) {
            System.out.println("\nResult: Element found at index " + resultIndex);
        } else {
            System.out.println("\nResult: Element not found");
        }
    }
}

class BinarySearchImpl {

    int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;
        int iteration = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            System.out.println(
                    "\n----------------------------------------------------------" +
                            "\nIteration " + iteration +
                            "\nLeft = " + left + "; Right = " + right + "; Mid = " + mid +
                            "\narr[mid] = " + arr[mid]
            );

            if (arr[mid] == target) {
                System.out.println("Found target " + target + " at index " + mid + "\n"
                        + "----------------------------------------------------------\n"
                );
                return mid;
            } else if (arr[mid] < target) {
                System.out.println(
                        "Target = " + target + "    >   arr[mid] = " + arr[mid] + "   -> Searching right half\n"
                        + "----------------------------------------------------------\n"
                        );
                left = mid + 1;
            } else {
                System.out.println(
                        "Target = " + target + "    <   arr[mid] = " + arr[mid] + "    -> Searching left half\n"
                        + "----------------------------------------------------------\n"
                        );
                right = mid - 1;
            }

            iteration++;
        }

        System.out.println("Element not found in the array.");
        return -1;
    }
}
