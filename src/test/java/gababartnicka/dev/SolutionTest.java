package gababartnicka.dev;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    private Solution checker = new Solution();

    @Test
    public void testValid() {
        assertEquals(true, checker.isValid("()"));
    }

    @Test
    public void testInvalid() {
        assertEquals(false, checker.isValid("[(])"));
    }

    @Test
    public void test() {
        assertTrue(checker.isValid("(){}[]"));
        assertTrue(checker.isValid("([{}])"));
        assertFalse(checker.isValid("(}"));
        assertFalse(checker.isValid("[(])"));
        assertFalse(checker.isValid("[({})](]"));
    }
}
