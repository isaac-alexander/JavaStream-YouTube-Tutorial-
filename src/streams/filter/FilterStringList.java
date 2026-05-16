package streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterStringList {

    static void main(String[] args) {

        // SOURCE
        List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Orange", "Cherry");

        // Traditional way
        List<String> filteredFruits = new ArrayList<>();

        for (String fruit: fruits) {
            if (fruit.equals("Banana")){
                filteredFruits.add(fruit);
            }
        }

        System.out.println(filteredFruits);

        // Using Stream API to filter strings from a list
        List<String> result = fruits.stream().filter(fruit-> fruit.equals("Banana"))
                .toList();
        System.out.println(result);

    }
}
