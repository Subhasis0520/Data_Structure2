package com.company;

import java.util.Scanner;


public class Sort_LL {

    public static LinkedListNode<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> tail = null;
        while (data != -1) {
            LinkedListNode<Integer> currentNode = new LinkedListNode<Integer>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
                tail.next =currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }

     public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if (head1==null)
        {
            return head2;
        }

        if (head2==null)
        {
            return head1;
        }

        LinkedListNode<Integer> newHead=null,node1=head1,node2=head2,newNode=null;
        int data1=node1.data,data2=node2.data;
        if (data1<data2)
        {
            newHead=node1;
            node1=node1.next;
        }
        else
        {
            newHead=node2;
            node2=node2.next;
        }
        newNode=newHead;
        while(node1!=null && node2!=null)
        {
            data1=node1.data;
            data2=node2.data;
            if (data1<data2)
            {
                newNode.next=node1;
                newNode=newNode.next;
                node1=node1.next;
            }
            else
            {
                newNode.next=node2;
                newNode=newNode.next;
                node2=node2.next;
            }
        }

        while(node1!=null)
        {
            newNode.next=node1;
            newNode=newNode.next;
            node1=node1.next;
        }
        while (node2!=null)
        {
            newNode.next=node2;
            newNode=newNode.next;
            node2=node2.next;
        }
        return newHead;
    }

    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> fast=head,slow=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
        //Your code goes here
        //Handling base case where length of linked is 0 or 1
        if (head==null || head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> midNode=midPoint(head),part1Head=head,part2Head=null;
        part2Head=midNode.next;
        midNode.next=null;
        LinkedListNode<Integer> head1=mergeSort(part1Head);
        LinkedListNode<Integer> head2=mergeSort(part2Head);
        LinkedListNode<Integer> newHead=mergeTwoSortedLinkedLists(head1,head2);
        return newHead;
    }

    public static void print(LinkedListNode<Integer> head) {

        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
     LinkedListNode<Integer> head = takeInput();
        LinkedListNode<Integer> mg = mergeSort(head);
        print(mg);
    }

}
