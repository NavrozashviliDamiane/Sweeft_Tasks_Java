//Task - 1


package org.TechnicalTasks;
import java.util.HashSet;


public class FindUniqueNumber {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> repeatedSet = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num) && !repeatedSet.contains(num)) {
                set.add(num);
            } else {
                set.remove(num);
                repeatedSet.add(num);
            }
        }

        for (int num : set) {
            return num;
        }

        return -1;
    }
}