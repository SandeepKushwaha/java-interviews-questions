package array;

class BinarySearch {

    /**
     * Main method of the class for the following question:
     *   Find a target of elements of a given array using binary search.
     * */
    public static void main(String[] args) {
        /* Example:
         * int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
         * int target = 5;
         */
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter length of array: ");

        int length = scanner.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter target: ");
        int target = scanner.nextInt();

        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}