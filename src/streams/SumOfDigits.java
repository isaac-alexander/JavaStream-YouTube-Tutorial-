package streams;

import java.util.stream.IntStream;

// Find the Sum of All Digits of a Number using Stream
public class SumOfDigits {

    static void main(String[] args) {

        // given input
        int input = 12345; // 15

        int sum = String.valueOf(input).chars().map(Character::getNumericValue)
                .sum();
        System.out.println(sum);
    }
}
