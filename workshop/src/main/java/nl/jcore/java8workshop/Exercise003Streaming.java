package nl.jcore.java8workshop;

import nl.jcore.java8workshop.util.User;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise003Streaming {
    /**
     * Use a stream to multiply all elements in the input
     * list by two and return the result.
     */
    static List<Integer> multiplyByTwo(final List<Integer> numbers) {
        return numbers.stream()
                /* Transformation: Multiply by two. */
                .collect(Collectors.toList());
    }

    /**
     * Use a stream to return a list of strings with the
     * equivalent values of the integer input list.
     */
    static List<String> getStringValues(final List<Integer> numbers) {
        return null;
    }

    /**
     * Return a list of all BigDecimals that contain the
     * number 5, such as 50, 5 and 0.5.
     */
    static List<BigDecimal> getNumbersContaining5(final List<BigDecimal> numbers) {
        return null;
    }

    /**
     * Filter out odd numbers so that the sum of the
     * IntStream will produce the sum of all even numbers.
     */
    static int sumOfEvenNumbersInCollection(final List<Integer> numbers) {
        return numbers.stream()
                .mapToInt(x -> x)
                /* Filter out odd numbers. */
                .sum();
    }

    /**
     * Return a list of addresses of users. Note that some
     * users don't have an address.
     * Addresses should be in the format
     * "street<space>housenumber" (without quotes).
     */
    static List<String> getAddressesOfUsers(final List<User> users) {
        return null;
    }
}
