package com.company;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

       /* stack.push(10);
        stack.push(20);
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());

        */

     int [] arr = {9,7,5,1,3,6,4};
        for (int elem: arr) {
            System.out.println(stack.push(elem));
        }

    }
}
