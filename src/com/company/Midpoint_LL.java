package com.company;
import java.util.Scanner;

public class Midpoint_LL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("Enter the data");
            int data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            } else {
                new_node.next = head;
                head = new_node;

            }

            System.out.println("Press 1 if you want to process");
            n = sc.nextInt();
        }
        while (n == 1);
    }

    public void midPoint(){
        int count = 0;
        Node temp = head;
        Node temp2 = head;
        while (temp.next != null && temp.next.next != null){
            count++;
            temp = temp.next.next;
            temp2 = temp2.next;
        }

        System.out.println("Mid point is: " + count +" and data is: "+ temp2.data );

    }


    public void print() {
        Node temp = head;
        if(head ==null) {
            System.out.println("Linked list is not available");
        }
        else {
            while(temp!= null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }


    public static void main(String[] args) {
  Midpoint_LL md = new Midpoint_LL();
  md.creation();
  md.midPoint();

  md.print();
    }
}