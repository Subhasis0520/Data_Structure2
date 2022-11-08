package com.company;

import java.util.Scanner;

public class Insert_DoublyLL {
    static class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    Node head = null;
    Node tail = null;

    public void insert() {
        Scanner sc = new Scanner(System.in);
        int m,n,p;
        do {
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            }
            else {
                System.out.print("Enter 1 to insert at beginning, 2 to insert at the end, 3 for any given position: ");
                m = sc.nextInt();
                switch(m){
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;

                    case 2:
                           tail.next = new_node;
                            new_node.prev = tail;
                            tail = new_node;
                       break;

                    case 3:
                        System.out.print("enter the position where to insert: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        for(int i =0; i<(p-1); i++) {
                            temp1 = temp1.next;
                            ptr =ptr.next;
                        }
                        new_node.next =ptr;
                        new_node.prev= temp1;
                        temp1.next = new_node;
                        ptr.prev = new_node;
                        break;
                }

            }

            System.out.print("Do you want more data,then press 1: ");
            n = sc.nextInt();
        }
        while(n==1);
    }

    public void print(){
        if (head == null){
            System.out.print("LL is not available");
        }
        else {
            System.out.print("The LL is: ");
            Node temp = head;
            while (temp!= null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
      Insert_DoublyLL ind = new Insert_DoublyLL();
      ind.insert();
      ind.print();
    }
}
