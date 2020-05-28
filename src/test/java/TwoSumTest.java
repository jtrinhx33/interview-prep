import DailyCodingProblem.TwoSum;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest extends TestCase {

    protected int[] array1 = {1, 2};
    protected void setUp() {

    }

    @Test
    public void testEmpty() {
        boolean result = TwoSum.twoSum(array1, 10);
        assertEquals(result, false);
    }
}