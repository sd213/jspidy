package com.assignment;

import java.util.LinkedList;
import java.util.Collections;

public class SortLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(2);

        System.out.println("Before sorting: " + list);

        // Sorting the linked list in natural order (ascending)
        Collections.sort(list);

        System.out.println("After sorting: " + list);
    }
}