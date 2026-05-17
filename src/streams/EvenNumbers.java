package streams;

import java.util.Arrays;
import java.util.List;

// Print Even Numbers from a List using Stream
public class EvenNumbers {

    static void main(String[] args) {

        // List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // convert to stream
        numbers.stream()
                .filter(num -> num % 2 == 0) // filter to add condition - find even numbers
                .forEach((num)-> System.out.println(num));
    }
}
