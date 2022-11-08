package com.company;

import java.util.Scanner;

public class Insert_In_CircularLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
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
                tail = new_node;
                new_node.next = head;
            }
            else {
                System.out.print("Enter 1 to insert at beginning, 2 to insert at the end, 3 for any given position: ");
                m = sc.nextInt();
                switch(m){
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next= head;
                        break;

                    case 2:
                         tail.next= new_node;
                         tail = new_node;
                         new_node.next=head;
                        break;

                    case 3:
                        System.out.print("enter the position where to insert: ");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for(int i =1; i<p; i++) {
                            temp1 = temp1.next;
                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }

            }

            System.out.print("Do you want more data,then press 1: ");
            n = sc.nextInt();
        }
        while(n==1);
    }

    public void print() {
        Node temp = head;
        if(head ==null) {
            System.out.println("Linked list is not available");
        }
        else {
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }while(temp!= head);
        }
    }
    public static void main(String[] args) {
          Insert_In_CircularLL icl = new Insert_In_CircularLL();
          icl.insert();
          icl.print();
    }
}
