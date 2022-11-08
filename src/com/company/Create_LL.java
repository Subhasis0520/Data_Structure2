package com.company;

import java.util.Scanner;


public class Create_LL {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head = null;
    public void creation() {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter the data: ");
            int data = sc.nextInt();
            Node new_node = new Node(data);

            if (head == null) {
                head = new_node;
            }
            else {
                Node temp = head;
                while(temp.next != null) {
                    temp = temp.next;
                }
                temp.next = new_node;

            }

            System.out.print("Press 1 if you want to process: ");
            n = sc.nextInt();
        }
        while(n==1);
    }

    public void count() {
        Node temp2 = head;
        int count = 0;
        while(temp2 != null) {
            count++;
            temp2 = temp2.next;
        }
        System.out.println("The no of element present in LL is: " + count);
    }


    public void maxNode(){
      Node temp3 = head;
        int max =0;
      while (temp3!= null){
          if (temp3.data > max){
              max = temp3.data;
          }
          temp3 = temp3.next;
      }
        System.out.println("The highest node is: " + max);
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
        Create_LL cl = new Create_LL();
        cl.creation();
        cl.maxNode();
        cl.count();
        cl.print();

    }

}

