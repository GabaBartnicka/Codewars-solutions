package gababartnicka.dev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void test1() {
        assertEquals(2022, Solution.findNb(4183059834009L));
    }
    @Test
    public void test2() {
        assertEquals(-1, Solution.findNb(24723578342962L));
    }
    @Test
    public void test3() {
        assertEquals(4824, Solution.findNb(135440716410000L));
    }
    @Test
    public void test4() {
        assertEquals(3568, Solution.findNb(40539911473216L));
    }
    @Test
    public void test5() {
        assertEquals(45, Solution.findNb(1071225L));
    }
    @Test
    public void test6() {
        assertEquals(-1, Solution.findNb(91716553919377L));
    }
    @Test
    public void test7() {
        assertEquals(3, Solution.findNb(36L));
    }
}
