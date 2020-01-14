package gababartnicka.dev;

import java.util.function.Function;

public class Solution {

    public static int persistence(long n) {
        Function<Long, Long> reductor = number -> String.valueOf(number)
                .chars()
                .mapToObj(i -> (char) i)
                .map(value -> Long.valueOf(value.toString()))
                .reduce(1L, (subtotal, element) -> subtotal * element);

        int i = 0;
        while (n >= 10L) {
            n = reductor.apply(n);
            i++;
        }

        return i;
    }

    public static int persistence2(long n) {
        int times = 0;
        while (n >= 10) {
            n = Long.toString(n).chars().reduce(1, (r, i) -> r * (i - '0'));
            times++;
        }
        return times;
    }
}