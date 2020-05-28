package DailyCodingProblem;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public static boolean twoSum(int[] array, int target) {
        if (array == null || array.length < 2 ) return false;

        Set<Integer> set = new HashSet<>();
        set.add(target - array[0]);

        for (int i = 1; i < array.length; i++) {
            if (set.contains(array[i])) return true;
            set.add(target - array[i]);
        }

        return false;
    }
}
