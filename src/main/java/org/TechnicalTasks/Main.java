package org.TechnicalTasks;


public class Main {
    public static void main(String[] args) {

        //Test for TASK-1 FindUniqueNumber
        int[] nums = {4, 4, 5, 1, 2, 1, 2};
        FindUniqueNumber finder = new FindUniqueNumber();
        int singleNumber = finder.singleNumber(nums);
        System.out.println("(Test for TASK-1) The number that does not repeat is: " + singleNumber);


        //Test for TASK-2 FindUniqueNumber
        CoinSplitter splitter = new CoinSplitter();
        int amount = 73;
        int minCoins = splitter.minSplit(amount);
        System.out.println("(Test for TASK-2) Minimum coins needed to make " + amount + " tetri: " + minCoins);


        //Test for TASK-3 MissingIntegerFinder
        MissingIntegerFinder finderInt = new MissingIntegerFinder();
        int[] array = {1, 3, 6, 4, 1, 2};
        int result = finderInt.notContains(array);
        System.out.println("(Test for TASK-3) The minimum positive integer not in the array is: " + result);

        //Test for TASK-4 BinarySum
        BinarySum binarySum = new BinarySum();
        String a = "1010";
        String b = "1011";
        String sum = binarySum.addBinary(a, b);
        System.out.println("(Test for TASK-4) The sum of " + a + " and " + b + " is: " + sum);

        //Test for TASK-5 StaircaseClimbing
        StaircaseClimbing climber = new StaircaseClimbing();
        int stairsCount = 5;  // Number of floors
        int ways = climber.countVariants(stairsCount);
        System.out.println("(Test for TASK-5) Number of ways to climb " + stairsCount + " floors: " + ways);

        //Test for TASK-6
        ConstantTimeDeletionLinkedList list = new ConstantTimeDeletionLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);

        // Print the list before deletion
        Node curr = list.head.next;
        while (curr != list.tail) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println(" :(TEST for Task-6) before deleting");

        list.delete(2);

        // Print the list after deletion
        curr = list.head.next;
        while (curr != list.tail) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println(" :(TEST for Task-6) After deleting");


    }
}
