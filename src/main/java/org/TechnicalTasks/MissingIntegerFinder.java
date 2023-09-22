//Task-3


package org.TechnicalTasks;

import java.util.HashSet;

public class MissingIntegerFinder {

    public int notContains(int[] array) {
        HashSet<Integer> set = new HashSet<>();


        for (int num : array) {
            set.add(num);
        }

        int i = 1;


        while (set.contains(i)) {
            i++;
        }

        return i;
    }




}

