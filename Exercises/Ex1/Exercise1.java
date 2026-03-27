import java.util.HashMap;
import java.util.Map;

/**
 * CONCEPT: The Dictionary vs. The Map
 * In Python, you might use a `dict` or `collections.Counter` to track frequencies.
 * Java requires using the `Map` interface with explicit type declarations for keys and values.
 * We use a HashMap here because it provides O(1) average time complexity for lookups,
 * mirroring the performance characteristics of a Python dictionary for counting tasks.
 *
 * TASK: Complete the `countWords` method to count the occurrences of each string in the provided array.
 */
public class WordFrequency {
    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> counts = new HashMap<>();
        
        // TODO: Implement the counting logic and return the populated map.
        
        return counts;
    }

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "apple", "orange", "banana", "apple"};
        System.out.println(countWords(input)); 
        // Expected Output: {orange=1, banana=2, apple=3}
    }
}