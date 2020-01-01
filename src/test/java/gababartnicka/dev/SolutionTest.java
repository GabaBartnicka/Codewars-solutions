package gababartnicka.dev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test_01() {
        assertEquals(0, Solution.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, Solution.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, Solution.sortDesc(123456789));
    }
}
