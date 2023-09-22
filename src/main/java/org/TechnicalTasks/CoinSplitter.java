//Task-2

package org.TechnicalTasks;

public class CoinSplitter {

    public int minSplit(int amount) {
        int[] denominations = {50, 20, 10, 5, 1};
        int count = 0;

        for (int denomination : denominations) {
            while (amount >= denomination) {
                amount -= denomination;
                count++;
            }
        }

        return count;
    }




}

