public class FindMaxElementInArray {
    public static int findMaxElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i<arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,7,56,412,312,31,6,54,43,65};
        int maxElement = findMaxElement(arr);
        System.out.println("The maximum element in the array: " + maxElement);
    }
}
