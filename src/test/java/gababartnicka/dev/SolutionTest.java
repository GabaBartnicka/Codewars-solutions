package gababartnicka.dev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void BasicTests() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Solution.persistence(39));
        assertEquals(0, Solution.persistence(4));
        assertEquals(2, Solution.persistence(25));
        assertEquals(4, Solution.persistence(999));
    }

    @Test
    public void single() {
        System.out.println("****** Basic Tests ******");
        assertEquals(3, Solution.persistence(39));
    }
}
