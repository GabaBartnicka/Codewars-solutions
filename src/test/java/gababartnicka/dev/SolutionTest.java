package gababartnicka.dev;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    @Test
    public void test() {
        assertEquals(")()())()(()()(",
                Solution.encode("Prespecialized"));
        assertEquals("))))())))",Solution.encode("   ()(   "));
    }
}
