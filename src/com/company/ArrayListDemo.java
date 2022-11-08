package com.company;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0; i<20; i++){
            arr.add(i+4);
        }
        arr.add(10);
        arr.add(21,98);
        arr.remove(17);
        arr.set(9,122);
        arr.set(0,100);

        for (int i: arr ) {
            System.out.println(i);
        }
        System.out.println("The size of the arr is: " +arr.size());
        System.out.println(arr.get(0));
    }
}
