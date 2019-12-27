package gababartnicka.dev;

import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {
    public static String encode(String word) {
        StringBuilder sb = new StringBuilder();
        char[] allChars = word.toLowerCase().toCharArray();

        Function<Character, Long> counterFunction = character ->
                IntStream.range(0, allChars.length).mapToObj(i -> allChars[i]).filter(c -> c.equals(character)).count();

        Stream<Character> charStream = IntStream.range(0, allChars.length).mapToObj(i -> allChars[i]);

        charStream.forEach(c -> {
            final Long counter = counterFunction.apply(c);
            sb.append(counter > 1? ")" : "(");

        });


        return sb.toString();
    }
}
