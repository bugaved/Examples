package com.HashTable;


public class ListNode implements Comparable<ListNode> {
    private int value;
    private int HashKey;
    ListNode next;

    public void setValue(int value) {
        this.value = value;
    }

    public void setHashKey(int hashKey) {
        HashKey = hashKey;
    }


    public ListNode getNext() {
        return next;
    }


    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public int getHashKey() {
        return HashKey;
    }

    @Override
    public int compareTo(ListNode o) {
        return o.getHashKey() - this.getHashKey();
    }


}

