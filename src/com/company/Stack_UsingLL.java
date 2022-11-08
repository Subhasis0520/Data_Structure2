package com.company;

import java.util.Scanner;

class Stack1 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node top = null;


    public void  push(Scanner sc){
        System.out.println("Enter the data");
        int data = sc.nextInt();
        Node new_node = new Node(data);
        if (top == null){
            top = new_node;
        }
        else {
            new_node.next = top;
            top = new_node;
        }
    }
    public  void pop(){
        if (top == null){
            System.out.println("Stack is empty");
        }
        else{
            top = top.next;
        }
    }
    public void print(){
        Node temp = top;
        while (temp!= null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    
}


public class Stack_UsingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack1 stack = new Stack1();
        int d,s;
        do {
            System.out.println("press 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for print");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    stack.push(sc);
                    break;
                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.print();
                    break;
            }
            System.out.println("enter 0 to go back to menu");
            s = sc.nextInt();

        } while (s == 0);

    }
}



