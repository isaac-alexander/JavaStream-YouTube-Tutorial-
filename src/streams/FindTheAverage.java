package streams;

import java.util.Arrays;
import java.util.List;

public class FindTheAverage {

    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        double average = numbers.stream()// convert list to stream
                .mapToInt(num -> num.intValue())// convert Integer to int
                .average() // calculate the average
                .getAsDouble(); // get average in double

        System.out.println(average);
    }
}
