package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// Find the Second-Largest Number in the List of Integers using Stream
public class FindTheSecondLargestNumber {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 35, 50, 50, 75, 65);

        int secondLargest = numbers.stream()
                .distinct() // removes duplicates
                .sorted(Comparator.reverseOrder()) // 75, 65, 50, 35, 20, 10 desc order
                .skip(1) // skips the first number
                .findFirst()// finds/gets the first number after skip
                .get();

        System.out.println(secondLargest);
    }
}
