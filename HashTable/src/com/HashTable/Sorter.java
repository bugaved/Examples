package com.HashTable;

import java.util.Arrays;

public class Sorter {
    public ListNode[] Sorting1(ListNode ln1[]) {
        System.out.println("sorting1");
        Arrays.sort(ln1);
        return ln1;
    }

    public String[] Sorting2(ListNode ln2[]) { //only for sorted list
        System.out.println("sorting 2");

        String[] SortedHashList = new String[ln2.length];
        int hk = 0;
        for (int counter = 0; counter < ln2.length; counter++) {
            boolean Last = false;
            if (counter == ln2.length - 1) {
                Last = true;
            }
            if (Last == false) {
                if (ln2[counter].getHashKey() == ln2[counter + 1].getHashKey()) {
                    ln2[counter].setNext(ln2[counter + 1]);
                }
            }

        }
        for (int counter2 = 0; counter2 < ln2.length; counter2++) {
            if (counter2 == hk) {
                SortedHashList[hk] = ln2[counter2].getHashKey() + ": " + ln2[hk].getValue();
                hk++;
            }
            if (ln2[counter2].getNext() != null) {
                SortedHashList[ln2[counter2].getHashKey()] = SortedHashList[ln2[counter2].getHashKey()] + ", " + ln2[counter2].getNext().getValue();
            }
        }
        return SortedHashList;
    }
}



