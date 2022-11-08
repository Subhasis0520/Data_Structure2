package com.company;

import java.util.Scanner;

public class Create_DoublyLL {
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

    public void create(){
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null){
                head=new_node;
                tail= new_node;
            }
            else {
                tail.next = new_node;
                new_node.prev=tail;
                tail = new_node;
            }
            System.out.print("Press 1 if you want to process: ");
           n = sc.nextInt();
        }while (n==1);
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
                        temp1 = temp1.next;
                        head = temp1;
                        head.prev = null;
                        break;
                    case 2:
                        Node temp2 = tail;
                        temp2 = temp2.prev;
                        temp2.next = null;
                        tail= temp2;
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
                        ptr2.next.prev= temp3;
                        break;
                }

            }

            System.out.print("Do you want to delete more data,then press 1: ");
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
     Create_DoublyLL cdl = new Create_DoublyLL();
     cdl.create();
     cdl.delete();
     cdl.print();
    }
}
