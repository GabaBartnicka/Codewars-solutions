package gababartnicka.dev;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;
import java.util.function.Predicate;

public class Solution {

    static final Character openBrace = '(';
    static final Character openBracket = '[';
    static final Character openCurlyBrace = '{';

    static final Character closingBrace = ')';
    static final Character closingBracket = ']';
    static final Character closingCurlyBrace = '}';

    public boolean isValid(String braces) {

        Predicate<Character> isClosing = character -> character.equals(closingBrace) ||
                character.equals(closingBracket) || character.equals(closingCurlyBrace);

        final char[] bracesArray = braces.toCharArray();
        if (bracesArray.length == 1)
            return false;

        if (isClosing.test(bracesArray[0]))
            return false;

        var braceQueue = new ArrayList<Character>();
        braceQueue.add(bracesArray[0]);

        for (int i = 1; i < bracesArray.length; i++) {
            final var brace = bracesArray[i];

            if (isClosing.test(brace)) {
                try {
                    final int index = braceQueue.size() - 1;
                    var previous = braceQueue.get(index);
                    braceQueue.remove(index);
                    var matchesToPreviousOpenedBrace = matchesToPreviousOpenedBrace(brace, previous);
                    if (!matchesToPreviousOpenedBrace) {
                        return false;
                    }
                } catch (Exception e) {
                    return false;
                }
            } else {
                braceQueue.add(brace);
            }
        }
        return braceQueue.isEmpty();
    }


    public boolean matchesToPreviousOpenedBrace(Character closing, Character previous) {
        if (Objects.equals(closing, closingBrace) && Objects.equals(previous, openBrace))
            return true;
        if (Objects.equals(closing, closingBracket) && Objects.equals(previous, openBracket))
            return true;
        return Objects.equals(closing, closingCurlyBrace) && Objects.equals(previous, openCurlyBrace);
    }

    /**
     * "(){}[]"   =>  True
     * "([{}])"   =>  True
     * "(}"       =>  False
     * "[(])"     =>  False
     * "[({})](]" =>  False
     */


    public boolean isValid2(String braces) {
        Stack<Character> s = new Stack<>();
        for (char c : braces.toCharArray())
            if (s.size() > 0 && isClosing(s.peek(), c)) s.pop();
            else s.push(c);
        return s.size() == 0;
    }

    public boolean isClosing(char x, char c) {
        return (x == '{' && c == '}') || (x == '(' && c == ')') || (x == '[' && c == ']');
    }


    public boolean isValid3(String braces) {
        String b = braces;
        System.out.println(braces);
        for(int i=0;i<braces.length()/2;i++)
        {
            b = b.replaceAll("\\(\\)", "");
            b = b.replaceAll("\\[\\]", "");
            b = b.replaceAll("\\{\\}", "");
            if(b.length() == 0)
                return true;
        }
        return false;
    }
}