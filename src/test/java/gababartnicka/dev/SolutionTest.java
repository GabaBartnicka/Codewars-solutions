package gababartnicka.dev;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testBasic() {
        assertFalse("0  is not prime", Solution.isPrime(0));
        assertFalse("1  is not prime", Solution.isPrime(1));
        assertTrue ("2  is prime",     Solution.isPrime(2));
        assertTrue ("73 is prime",     Solution.isPrime(73));
        assertFalse("75 is not prime", Solution.isPrime(75));
        assertFalse("-1 is not prime", Solution.isPrime(-1));
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", Solution.isPrime(3));
        assertTrue("5 is prime", Solution.isPrime(5));
        assertTrue("7 is prime", Solution.isPrime(7));
        assertTrue("41 is prime", Solution.isPrime(41));
        assertTrue("5099 is prime", Solution.isPrime(5099));
    }

    @Test
    public void testNotPrime() {
        assertFalse("4 is not prime", Solution.isPrime(4));
        assertFalse("6 is not prime", Solution.isPrime(6));
        assertFalse("8 is not prime", Solution.isPrime(8));
        assertFalse("9 is not prime", Solution.isPrime(9));
        assertFalse("45 is not prime", Solution.isPrime(45));
        assertFalse("-5 is not prime", Solution.isPrime(-5));
        assertFalse("-8 is not prime", Solution.isPrime(-8));
        assertFalse("-41 is not prime", Solution.isPrime(-41));
    }

    @Test
    public void testRandom() {
        assertFalse("983261449 is not prime", Solution.isPrime(983261449));
        assertFalse("334414369 is not prime", Solution.isPrime(334414369));
    }
}
