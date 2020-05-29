package AlgoExpert;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RiverSizesTest {

    @Test
    void emptyMatrixShouldReturnEmpty() {
        int[][] matrix = {{}};
        List<Integer> results = RiverSizes.riverSizes(matrix);
        Assert.assertEquals(results.size(), 0);
        Assert.assertEquals(results, new ArrayList<>());
    }

    @Test
    void singleElementMatrixShouldReturnProperly() {
        int[][] matrix = {{1}};
        List<Integer> results = RiverSizes.riverSizes(matrix);
        Assert.assertEquals(results, new ArrayList<>(List.of(1)));

        int[][] matrix2 = {{0}};
        results = RiverSizes.riverSizes(matrix2);
        Assert.assertEquals(results, new ArrayList<>());
    }

    @Test
    void shouldReturnRiverSizes() {
        int[][] matrix = {
            {1, 0, 0, 1, 0},
            {1, 0, 1, 0, 0},
            {0, 0, 1, 0, 1},
            {1, 0, 1, 0, 1},
            {1, 0, 1, 1, 0},
        };

        List<Integer> results = RiverSizes.riverSizes(matrix);
        Assert.assertEquals(results, new ArrayList<>(List.of(2, 1, 5, 2, 2)));
    }

    @Test
    void singleRowShouldReturnRiverSizes() {
        int[][] matrix = {
                {1, 0, 1, 1, 0},
        };

        List<Integer> results = RiverSizes.riverSizes(matrix);
        Assert.assertEquals(results, new ArrayList<>(List.of(1, 2)));

        int[][] matrix2 = {
                {1, 1, 1, 1, 1},
        };

        results = RiverSizes.riverSizes(matrix2);
        Assert.assertEquals(results, new ArrayList<>(List.of(5)));
    }
}