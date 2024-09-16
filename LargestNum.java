public class LargestNum {
    public static void main(String[] args) {
        int arr[] = {1, 4, 6, 7, 8, 9};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) { // Start from 1 since max is initially arr[0]
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Largest number present in given integer array: " + max);
    }
}
