package com.company;

import java.util.LinkedList;

public class Collection_LL {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(2,82);
        list.addLast(30);
        list.addFirst(60);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.size());

    }
}
