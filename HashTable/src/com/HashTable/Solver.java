package com.HashTable;

import java.io.IOException;

public class Solver {
    public static void main(String[] args) throws IOException {
        Parser pr = new Parser();
        System.out.println("enter N");
        ListNode ln[] = pr.ParseValue();
        Sorter sort = new Sorter();
        ln = sort.Sorting1(ln);
        String x[];
        x = sort.Sorting2(ln);
        System.out.println(x);
    }
}
