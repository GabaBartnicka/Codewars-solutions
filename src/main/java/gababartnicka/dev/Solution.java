package gababartnicka.dev;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.stream.LongStream;

public class Solution {

    public static String listSquared(long m, long n) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Function<Long, Long> findDivisorsAndSquareAndSum = num ->
                LongStream.rangeClosed(1, num)
                        .filter(c -> num % c == 0)
                        .map(e -> e * e)
                        .sum();
        for (long i = m; i < n; i++) {
            final Long sum = findDivisorsAndSquareAndSum.apply(i);

            final BigInteger sqrt = BigInteger.valueOf(sum).sqrt();
            if (sqrt.pow(2).equals(BigInteger.valueOf(sum))) {
                if (sb.length() != 1)
                    sb.append(", ");
                sb.append("[");
                sb.append(i);
                sb.append(", ");
                sb.append(sum.longValue());
                sb.append("]");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}