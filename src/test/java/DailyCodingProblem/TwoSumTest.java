package DailyCodingProblem;

import DailyCodingProblem.TwoSum;
import junit.framework.TestCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest extends TestCase {
    @BeforeEach
    protected void setUp() {

    }

    @Test
    public void testEmpty() {
        int[] array = {};
        boolean result = TwoSum.twoSum(array, 10);
        assertFalse(result);
    }

    @Test
    public void testLengthOne() {
        int[] array = {1};
        boolean result = TwoSum.twoSum(array, 10);
        assertFalse(result);
    }

    @Test
    public void nonEmptyArrayHasAddends() {
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        boolean result = TwoSum.twoSum(array, 10);
        assertTrue(result);
    }

    @Test
    public void nonEmptyArrayDoesNotHaveAddends(){
        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        boolean result = TwoSum.twoSum(array, 30);
        assertFalse(result);
    }
}