package AlgoExpert;

import java.util.ArrayList;
import java.util.List;

public class RiverSizes {
    public static List<Integer> riverSizes(int[][] matrix) {
        List<Integer> results = new ArrayList<>();

        if (matrix == null || matrix[0] == null || matrix.length == 0 || matrix[0].length == 0) {
            return results;
        }

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {

                if (matrix[row][col] == 1) {
                    results.add(exploreRiver(directions, matrix, row, col));
                }
            }
        }

        return results;
    }

    public static int exploreRiver(int[][] directions, int[][] matrix, int row, int col) {
        if (row < 0 || col < 0 || row >= matrix.length || col >= matrix[0].length || matrix[row][col] == 0) return 0;

        matrix[row][col] = 0;

        int size = 1; // Init to 1 for current water cell
        for (int[] d: directions) {
            int newRow = row + d[0];
            int newCol = col + d[1];
            size += exploreRiver(directions, matrix, newRow, newCol);
        }

        return size;
    }
}
