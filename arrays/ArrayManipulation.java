import java.util.Arrays;
import java.util.HashSet;

public class ArrayManipulation {
    public static String[] removeDuplicatesAndSort(String[] arr) {
        HashSet<String> set = new HashSet<>(Arrays.asList(arr));

        String[] result = new String[set.size()];
        set.toArray(result);

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "orange", "apple", "kiwi", "orange"};
        String[] manipulatedArray = removeDuplicatesAndSort(arr);

        System.out.println("Array after removing duplicates and sorting:");
        for (String element : manipulatedArray) {
            System.out.println(element);
        }
    }
}
