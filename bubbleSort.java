//@AUTHOR Erblin Berisha

public class bubbleSort {
    public static void main(String[] args) {
        //input array
        int[] arrayToSort = {64, 34, 25, 12, 22, 11, 90};

        basicBubbleSort(arrayToSort);

        System.out.println("Sorted array:");
        printArray(arrayToSort);
    }

    public static void basicBubbleSort(int[] arr) {
        int n = arr.length;

        //outerloop
        //traverse whole array
        for (int i = 0; i < n - 1; i++) {
            //innerloop to compare adjacents and swap
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}