package streams.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapExamples {

    public static void main(String[] args) {

        // Source
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");

        Stream<String> stream = fruits.stream();
         List<String> list = stream
                 .peek((element) -> System.out.println("Before map() method: " + element))
                 .map((element) -> element.toUpperCase())
                 .peek((element) -> System.out.println("After map() method: " + element))
                .toList();
        System.out.println(list);
    }
}
