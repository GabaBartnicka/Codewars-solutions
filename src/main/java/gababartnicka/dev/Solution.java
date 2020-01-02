package gababartnicka.dev;

import java.math.BigDecimal;

public class Solution {
    public static long findNb(long m) {

        BigDecimal result = BigDecimal.ZERO;

        for (long i = 1;; i++) {
            final BigDecimal n = BigDecimal.valueOf(i);
            result = result.add(n.pow(3));


            if(result.longValue() == m) {
                return i;
            }
            if(result.longValue() < m) {
                continue;
            }
            if (result.longValue() > m) {
                return -1;
            }
        }
    }
}