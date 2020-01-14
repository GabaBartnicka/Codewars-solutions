package gababartnicka.dev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", Solution.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", Solution.pigIt("This is my string"));
    }

    @Test
    public void FixedTestsExt() {
        assertEquals("igPay atinlay siay oolcay!", Solution.pigIt("Pig latin is cool!"));
    }

    @Test
    public void FixedTestsExt2() {
        assertEquals("abaGay ?", Solution.pigIt("Gaba ?"));
    }
}
