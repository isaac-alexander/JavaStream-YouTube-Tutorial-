package streams;

import java.util.Arrays;
import java.util.List;

// Remove Duplicate Elements from a List using Stream
public class RemoveDuplicateElements {

    static void main(String[] args) {

        // Given list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        List<Integer> list = numbers.stream() // convert list to stream
                .distinct() // remove duplicates
                .toList(); // convert stream into list
        System.out.println(list);

        // Given list of strings
        List<String> fruits = Arrays.asList("apple", "orange", "apple", "banana");

        List<String> removedFruitDuplicate = fruits.stream() // convert list to stream
                .distinct() // remove duplicates
                .toList(); // convert stream into list
        System.out.println(removedFruitDuplicate);
    }
}
