package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// Find the Maximum Number and Minimum Number in a List using Stream
public class MaxMinWithStreams {

    static void main(String[] args) {

        // List
        List<Integer> numbers = Arrays.asList(10, 90, 8, 7, 6, 562, 4, 3, -2, 1);

        // convert list to stream
        int max = numbers.stream().mapToInt(Integer::intValue)
                .max()
                .getAsInt();

        System.out.println(max);

        // convert list to stream
        int min = numbers.stream().mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        System.out.println(min);

    }
}
