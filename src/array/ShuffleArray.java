package array;

import java.util.Arrays;
import java.util.Random;

public class ShuffleArray {

    /**
     * Main method of the class for the following question:
     *     Shuffle an array in Java.
     * */
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arr));

        shuffleArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shuffleArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }
}