/*
 * We use a HashMap here because it provides O(1) average time complexity for lookups,
 * mirroring the performance characteristics of a Python dictionary for counting tasks.
 */
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> counts = new HashMap<>();
        
        // TODO: Implement the logic to count occurrences of each word in the array.
        // Return the populated 'counts' map.
        
        return counts;
    }

    public static void main(String[] args) {
        String[] input = {"apple", "banana", "apple", "orange", "banana", "apple"};
        System.out.println(countWords(input)); 
        // Expected Output: {orange=1, banana=2, apple=3}
    }
}