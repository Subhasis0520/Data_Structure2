package com.company;

import java.util.Scanner;

public class Circular_LL {
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

    public void creation() {
        Scanner sc = new Scanner(System.in);
        int n;
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
               Node temp = head;

                   new_node.next = head;
                   head = new_node;
                   tail.next = head;
            }

            System.out.print("Press 1 if you want to process: ");
            n = sc.nextInt();
        }
        while(n==1);
    }

    public void delete() {
        Scanner sc = new Scanner(System.in);
        int m,n,p;
        do {
            Node new_node = head;
            if (head == null) {
                System.out.println("LL is empty");
            }
            else {
                System.out.print("Enter 1 to delete at beginning, 2 to delete at the end, 3 for delete at any given position: ");
                m = sc.nextInt();
                switch(m){
                    case 1:
                        Node temp1 = head;
                        head = temp1.next;
                        head = temp1;
                        tail.next = head;
                        break;
                    case 2:
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        while (ptr1.next != head){
                            temp2 = ptr1;
                            ptr1 = ptr1.next;
                        }
                        temp2.next = head;
                        tail = temp2;
                        break;

                    case 3:
                        Node temp3 = head;
                        Node ptr2 = temp3.next;
                        System.out.print("Enter the position from where to delete: ");
                        p = sc.nextInt();
                        for (int i =1; i<(p-1);i++){
                            temp3 = ptr2;
                            ptr2 = ptr2.next;
                        }
                        temp3.next = ptr2.next;
                        break;
                }

            }
            System.out.print("Do you want to delete more data,then press 1: ");
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
      Circular_LL cll = new Circular_LL();
      cll.creation();
      cll.delete();
      cll.print();
    }
}
