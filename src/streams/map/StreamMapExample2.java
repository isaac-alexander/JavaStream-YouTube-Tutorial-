package streams.map;

import java.util.Arrays;
import java.util.List;

public class StreamMapExample2 {

    static void main(String[] args) {

        // list of strings
        List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");

        List<Integer> list = listOfStrings.stream().map((element) -> Integer.valueOf(element))
                .toList();

        System.out.println(list);

    }
}
