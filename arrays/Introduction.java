import java.util.*;

public class Introduction {
    public static void main(String[] args) {
        // A array is a collection of items stored at contiguous memory locations. The idea is to store multiple items of the same type together.

        // 1 - Declaring an array
        int simpleArray[] = {1, 2, 3, 4, 5};
        // to access the elements of the specified array using their index position we use arrayName[index]
        System.out.println("1 - " + simpleArray[0]);
        System.out.println("=====================================");

        // 2 - to change the value of an element in the array we use arrayName[index] = newValue
        simpleArray[0] = 10;
        System.out.println("2 - " + simpleArray[0]);
        System.out.println("=====================================");

        // 3 - to get the length of the array we use arrayName.length
        System.out.println("3 - " + simpleArray.length);
        System.out.println("=====================================");

        // 4 - to print the array we use Arrays.toString(arrayName)
        System.out.println("4 - " + Arrays.toString(simpleArray));
        System.out.println("=====================================");

        // 5 - to order the array we use Arrays.sort(arrayName)
        Arrays.sort(simpleArray);
        System.out.println("5 - " + Arrays.toString(simpleArray));
        System.out.println("=====================================");

        // 6 - to fill the array with a value we use Arrays.fill(arrayName, value), this will fill the array with the specified value in all the indexes.
        Arrays.fill(simpleArray, 300);
        System.out.println("6 - " + Arrays.toString(simpleArray));
        System.out.println("=====================================");

        // 7 - to copy an array we use Arrays.copyOf(arrayName, length), this will copy the arrayName to a new array with the specified length.
        int copyArray[] = Arrays.copyOf(simpleArray, 10);
        System.out.println("7 - " + Arrays.toString(copyArray));
        // if the length is less than the original array then the remaining indexes will be filled with 0.
        System.out.println("=====================================");

        // 8 - to copy a range of an array we use Arrays.copyOfRange(arrayName, startIndex, endIndex), this will copy the arrayName to a new array with the specified length.
        int copyRangeArray[] = Arrays.copyOfRange(simpleArray, 3, 8);
        System.out.println("8 - " + Arrays.toString(copyRangeArray));
        System.out.println("=====================================");

        // 9 - to compare two arrays we use Arrays.equals(arrayName1, arrayName2), will return true if both the arrays are equal.
        System.out.println("9 - " + Arrays.equals(simpleArray, copyArray)); // will return false
        // but if we copy the arrayName to a new array with the same length then it will return true.
        int copyArray2[] = Arrays.copyOf(simpleArray, 5);
        System.out.println(Arrays.equals(simpleArray, copyArray2)); // will return true
        System.out.println("=====================================");

        // 10 - to search an element in the array we use Arrays.binarySearch(arrayName, value), will return the index of the value if found else will return a negative value.
        System.out.println("10 - " + Arrays.binarySearch(simpleArray, 300)); // will return 0
        // if the value is not found then it will return a negative value
        System.out.println(Arrays.binarySearch(simpleArray, 100)); // will return -1
        // the binarySearch method will only work if the array is sorted. because it uses the binary search algorithm, wich reparts the array in two parts and search in the middle.
        // if the value is less than the middle value then it will search in the first part else it will search in the second part, and it will continue until the value is found.
        System.out.println("=====================================");

        // 11 - to convert an array to a string we use Arrays.toString(arrayName)
        System.out.println("11 - " + Arrays.toString(simpleArray));
        System.out.println("=====================================");

        // 12 - to convert a string to an array we use stringName.toCharArray()
        String stringArray = "Hello World";
        System.out.println("12 - " + stringArray);
        char charArray[] = stringArray.toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println("=====================================");

        // Arrays are common in programming languages, they are used to store multiple values in a single variable, instead of declaring separate variables for each value.

    }
}
