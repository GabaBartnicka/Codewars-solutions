package gababartnicka.dev;

import java.util.stream.IntStream;

public class Solution {
    public static boolean isPrime(int num) {
        final double sqrt = Math.sqrt(num);
        double ceil = Math.ceil(sqrt);
        if ((ceil < 4 && ceil < num) || num/2.0 > ceil)
            ceil++;

        return num > 1 && IntStream.range(2, (int) ceil).filter(i -> num % i == 0).findAny().isEmpty();
    }

    public static boolean isPrime2(int num) {
        if (num <= 1)
            return false;

        final double sqrt = Math.sqrt(num);
        double ceil = Math.ceil(sqrt);
        if ((ceil < 4 && ceil < num) || num/2.0 > ceil)
            ceil++;

        System.out.println("ceil " + ceil);

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("found " + i);
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeWtf(int num) {
        return num > 1 && java.math.BigInteger.valueOf(num).isProbablePrime(20);
    }
}