package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // String[] strings = {"a", "b", "c", "d"};
        // on a 32-bit (4 bytes) system this array would take up 4 * 4 = 16 bytes of storage

        List strings = new ArrayList(Arrays.asList("a", "b", "c", "d"));

        // push
        strings.add("e"); // O(1)

        // pop
        strings.remove(strings.size() - 1); // O(1)

        // unshift
        strings.add(0, "x"); // O(n) -> shifting (or looping to shift) the rest of the elements

        // splice
        strings.add(2, "y"); // O(n)

        // lookup
        System.out.println(strings.get(2)); // O(1)

    }
}
