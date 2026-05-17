package streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Reverse Each Word of String using Stream
public class ReverseWords {

    static void main(String[] args) {

        // Given input string
        String input = "Hello Java World";

        String result = Stream
                .of(input.split(" "))
                .map((word) -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
