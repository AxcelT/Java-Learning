import java.util.ArrayList;
import java.util.List;

/**
 * CONCEPT: Dynamic Lists and Iteration
 * Python lists are dynamic by default. Standard arrays in Java are fixed-size.
 * To get a collection that can grow or shrink, you must use implementations of the 
 * `List` interface, such as `ArrayList`.
 *
 * TASK: Write a method that takes a fixed-size array of integers and returns a 
 * dynamic list containing only the odd numbers.
 */
public class NumberFilter {
    public static List<Integer> getOddNumbers(int[] numbers) {
        // TODO: Initialize a new ArrayList of Integers, iterate through the 'numbers' array, 
        // add the odd ones to the list, and return it.
        
        return null;
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(getOddNumbers(data));
        // Expected Output: [1, 3, 5, 7, 9]
    }
}