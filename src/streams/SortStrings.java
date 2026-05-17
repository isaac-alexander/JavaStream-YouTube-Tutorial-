package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Sort the List of Strings in Asc and Desc order using Stream
public class SortStrings {

    static void main(String[] args) {

        //Given input
        List<String> fruits = Arrays.asList("Banana", "Apple", "Mango", "Grapes");

        // Ascending order
        List<String> result = fruits.stream()
                .sorted() // Sorts in natural order (alphabetically)
                .toList();

        System.out.println(result);

        // Descending order
        List<String> result2 = fruits.stream()
                .sorted((Comparator.reverseOrder()))
                .toList();

        System.out.println(result2);
    }
}
