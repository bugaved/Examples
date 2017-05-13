package com.HashTable;

import java.util.Arrays;

public class Sorter {
    public ListNode[] Sorting1(ListNode ln1[]) {
        System.out.println("sorting1");
        Arrays.sort(ln1);
        return ln1;
    }

    public String[] Sorting2(ListNode sortedLn[]) { //only for sorted list
        System.out.println("sorting 2");



      String[] SortedHashList = new String[sortedLn.length];
        int hk = 0;
        boolean Last = false;
        for (int counter = 0; counter < sortedLn.length; counter++) {

            if (counter == sortedLn.length - 1) {
                Last = true;
            }
            if (Last == false) {
                if (sortedLn[counter].getHashKey() == sortedLn[counter + 1].getHashKey()) {
                    sortedLn[counter].setNext(sortedLn[counter + 1]);
                }
            }

        }
        for (int counter2 = 0; counter2 < sortedLn.length; counter2++) {
            if (sortedLn[counter2].getHashKey() == hk) {
                SortedHashList[hk] = sortedLn[counter2].getHashKey() + ": " + sortedLn[counter2].getValue();
                hk++;
            }
            if ((sortedLn[counter2].getNext() != null)) {
                SortedHashList[sortedLn[counter2].getHashKey()] = SortedHashList[sortedLn[counter2].getHashKey()] + ", " + sortedLn[counter2].getNext().getValue();
            }
        }
        return SortedHashList;
    }
}



