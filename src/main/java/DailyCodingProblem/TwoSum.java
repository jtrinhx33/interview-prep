package DailyCodingProblem;

import java.util.HashSet;
import java.util.Set;

/*
Problem # 1:

This problem was recently asked by Google.
Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
Bonus: Can you do this in one pass?
 */
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
