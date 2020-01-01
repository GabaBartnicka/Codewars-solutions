package gababartnicka.dev;

import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public static int sortDesc(final int num) {
        final int[] ints = Integer.toString(num).chars().map(n -> n - '0').sorted().toArray();
        StringBuilder sb = new StringBuilder();
        for (int i = ints.length - 1; i >= 0; i--) {
            sb.append(ints[i]);
        }

        return Integer.parseInt(sb.toString());
    }

    public static int sortDescBest(final int num) {
        return Integer.parseInt(String.valueOf(num)
                .chars()
                .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining()));
    }
}