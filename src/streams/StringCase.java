package streams;

import java.util.Arrays;
import java.util.List;

public class StringCase {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("Apple", "Banana", "Mango", "cherry", "Orange");

        List<String> result = words.stream()
                .map(String::toUpperCase)
                .toList();

        System.out.println(result);
    }
}
