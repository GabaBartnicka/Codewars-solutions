package gababartnicka.dev;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static String pigIt(String str) {
        String punctuationsRegex = "\\.|,|:|;|\\?|!";
        var punctuationMarks = Arrays.asList('.', ',', ':', ';', '!', '?');
        return Arrays.stream(str.split(" "))
                .map(word -> {
                    var copyOfWord = word.replaceAll(punctuationsRegex, "");
                    var sb = new StringBuilder();

                    if (!copyOfWord.isEmpty())
                        sb.append(copyOfWord.subSequence(1, copyOfWord.length())).append(copyOfWord.charAt(0)).append("ay");

                    var chars = word.toCharArray();

                    for (int i = 0; i < chars.length; i++) {
                        if (punctuationMarks.contains(chars[i])) {
                            int index = sb.length() == 0 ? 0 : i + 2;
                            sb.insert(index, chars[i]);
                        }
                    }
                    ;

                    return sb;
                })
                .reduce(new StringBuilder(), (subtotal, nextElement) -> subtotal.append(" ").append(nextElement))
                .toString()
                .trim();
    }

    public static String pigItWow(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }

    public static String pigIt3(String str) {
        return Arrays.stream(str.trim().split(" "))
                .map(v -> v.matches("[a-zA-Z]+") ? v.substring(1).concat(v.substring(0, 1)).concat("ay") : v)
                .collect(Collectors.joining(" "));
    }
}