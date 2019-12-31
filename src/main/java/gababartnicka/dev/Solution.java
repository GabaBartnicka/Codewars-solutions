package gababartnicka.dev;

import java.util.stream.Stream;

public class Solution {

    static String toCamelCase(String s){
        StringBuilder sb = new StringBuilder();
        final String[] splited = s.split("-|_");

        sb.append(splited[0]);
        splited[0] ="";

        Stream.of(splited)
                .filter(w->!w.isBlank())
                .forEach(word -> sb.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)));

        return sb.toString();
    }
}

/*
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"

toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"
 */