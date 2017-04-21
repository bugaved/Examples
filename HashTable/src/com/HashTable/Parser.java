package com.HashTable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

public class Parser {
    public int ParseN() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N;
        String s = br.readLine();
        N = parseInt(s);
        return N;
    }

    public ListNode[] ParseValue() throws IOException {
        int N = ParseN();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter values");
        String s = br.readLine();
        String[] spl = s.split(" ");
        ListNode ln[] = new ListNode[spl.length];
        for (int k = 0; k<spl.length; k++) {
            System.out.println(spl.length);
            System.out.println(spl[k] + "" +spl[k+1]);
            ln[k].setValue(Integer.parseInt(spl[k]));
            ln[k].setHashKey(ln[k].getValue()%N);
        }
        return ln;
    }
}
