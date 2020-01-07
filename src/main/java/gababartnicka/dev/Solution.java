package gababartnicka.dev;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {

    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .mapToObj(value -> (Integer) value)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() % 2 != 0)
                .findAny()
                .get()
                .getKey();
    }

    public static int findItXor(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }

    public static int findItReduce(int[] arr) {
        return Arrays.stream(arr).reduce(0, (x, y) -> x ^ y);
    }
}