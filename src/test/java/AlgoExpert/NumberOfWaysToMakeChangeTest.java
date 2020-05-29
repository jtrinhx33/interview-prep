package AlgoExpert;

import junit.framework.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfWaysToMakeChangeTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void emptyDenomsShouldReturnOne() {
        int[] denoms = {};
        int result = NumberOfWaysToMakeChange.numWays(8, denoms);
        Assert.assertEquals(result, 1);
    }

    @Test
    void zeroOrNegativeAmountShouldReturnOne() {
        int[] denoms = {1, 5};
        int result = NumberOfWaysToMakeChange.numWays(0, denoms);
        Assert.assertEquals(result, 1);

        result = NumberOfWaysToMakeChange.numWays(-1, denoms);
        Assert.assertEquals(result, 1);
    }

     @Test
    void nonEmptyDenomsAndAmountShouldReturnPositiveResult() {
         int[] denoms = {1, 5};
         int result = NumberOfWaysToMakeChange.numWays(6, denoms);
         Assert.assertEquals(result, 2);
     }

     @Test
    void cannotMakeChangeShouldReturnZero() {
        int[] denoms = {5};
        int result = NumberOfWaysToMakeChange.numWays(9, denoms);
        Assert.assertEquals(result, 0);
     }
}