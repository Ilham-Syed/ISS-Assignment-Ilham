package stringsAndArrays;
import java.util.Arrays;

public class StringsAndArrays {
	public static void main(String[] args) {
        // ======= Strings =======
        System.out.println("=== String Operations ===");
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String combined = str1 + " " + str2;
        System.out.println("Concatenated: " + combined);

        // Length
        System.out.println("Length: " + combined.length());

        // Convert to uppercase
        System.out.println("Uppercase: " + combined.toUpperCase());

        // Character at index
        System.out.println("Char at index 4: " + combined.charAt(4));

        // Check if it contains a word
        System.out.println("Contains 'World'? " + combined.contains("World"));

        // Substring
        System.out.println("Substring (0,5): " + combined.substring(0, 5));

        // Equals
        System.out.println("Equals 'Hello World'? " + combined.equals("Hello World"));

        // Replace
        System.out.println("Replace 'World' with 'Java': " + combined.replace("World", "Java"));

        System.out.println();

        // ======= Arrays =======
        System.out.println("=== Array Operations ===");
        int[] numbers = {5, 2, 9, 1, 3};

        // Print original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));

        // Copy array
        int[] copied = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied array: " + Arrays.toString(copied));

        // Check if two arrays are equal
        System.out.println("Arrays equal? " + Arrays.equals(numbers, copied));

        // Fill array
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("Filled array: " + Arrays.toString(filled));

        // Binary Search using inbuilt-Function
        int index = Arrays.binarySearch(numbers, 9);
        System.out.println("Index of 9: " + index);
    }
}
