package streams;

import java.util.Arrays;
import java.util.List;

// Find the square of the first three even numbers using Stream
public class FindSquare {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> result = numbers.stream()
                .filter((n) -> n % 2 == 0)
                .limit(3) // Limit to the first three even numbers
                .map((n) ->n * n) // Finds the square
                .toList(); // converts back to list

        System.out.println(result);
    }
}
