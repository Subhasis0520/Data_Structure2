package com.company;
import java.util.Scanner;

class DoubleNode{

    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(){

    }

    DoubleNode(Node<Integer> head, Node<Integer> tail){
        this.head= head;
        this.tail= tail;
    }
}

class Node<T>{
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
    }
}

public class LinkedListUse {
    public static Node<Integer> createLinkedList(){
        Node<Integer> n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
        Node<Integer> n4 = new Node<>(40);
        n1.next = n2;

//        System.out.println("n1 " + n1 + " data " + n1.data + " Next " + n1.next);
        n2.next = n3;

//        System.out.println("n2 " + n2 + " data " + n2.data + " Next " + n2.next);
        n3.next = n4;

//        System.out.println("n3 " + n3 + " data " + n3.data + " Next " + n3.next);
//        System.out.println("n4 " + n4 + " data " + n4.data + " Next " + n4.next);
        return n1;
    }

     public static void print(Node<Integer> head) {
       /*
        (Because it is repeat , we have to avoid it
        System.out.println(head.data);
         System.out.println(head.next.data);
         System.out.println(head.next.next.data);
        */
         Node<Integer> temp = head;
         while (temp != null) {
             System.out.print(temp.data + " ");
             temp = temp.next;
         }
         System.out.println();
     }
 public static void increment(Node<Integer> head){
     Node<Integer> temp = head;
     while (temp != null) {
         head.data++;
         temp = temp.next;
     }
     }

    public static Node<Integer> takeInput() {
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        while (data != -1) {
            Node<Integer> currentNode = new Node<Integer>(data);
            if (head == null) {
                head = currentNode;
                tail = currentNode;
            } else {
//                Node<Integer> tail = head;
//                while (tail.next != null) {
//                    tail = tail.next;
//                }
//                tail.next = currentNode;
                tail.next =currentNode;
                tail = currentNode;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static Node<Integer> insert(Node<Integer> head,  int data,int pos){
        Node<Integer> nodeToBeInsert = new Node<Integer>(data);
        if (pos==0){
            nodeToBeInsert.next = head;
           return nodeToBeInsert;
        }else {
            int count = 0;
            Node<Integer> prev = head;
            while (count < pos - 1 && prev != null) {
                count++;
                prev.next = prev;
            }
            if (prev != null) {
                nodeToBeInsert.next = prev.next;
                prev.next = nodeToBeInsert;
            }
            return head;
        }
    }

    public static void printR(Node<Integer> head){
        if (head==null){
            return;
        }
        else {
//            printR(head.next);   // for reverse order printing
            System.out.print(head.data + " ");
            printR(head.next);
        }
    }

    public static Node<Integer> insertR(Node<Integer> head, int elem, int pos){
          if (head==null && pos>0){
              return head;
          }
        if (pos == 0){
            Node<Integer> newNode = new Node<>(elem);
            newNode.next= head;
            return newNode;
        }
        else {
            head.next = insertR(head.next, elem, pos-1);
            return head;
        }
    }


 public static  Node<Integer> deleteR(Node<Integer> head, int pos)   {
        if (head==null && pos>0){
            return head;
        }
        if (pos == 0){
            head = head.next;
            return head;
        }
        else {
            head.next = deleteR(head.next,pos-1);
            return head;
        }
 }

    public static Node<Integer> reverseR(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> smallHead= reverseR(head.next);
        Node<Integer> tail= smallHead;
        while(tail.next != null){
            tail= tail.next;
        }
        tail.next =head;
        head.next= null;
        return smallHead;
    }


    public static DoubleNode reverseRBetter(Node<Integer> head){
        DoubleNode ans;
        if(head==null || head.next ==null){
            ans= new DoubleNode(head, head);
            ans.head= head;
            ans.tail= head;
            return ans;
        }
        DoubleNode smallAns= reverseRBetter(head.next);
        smallAns.tail.next= head;
        head.next= null;
        ans = new DoubleNode();
        ans.head= smallAns.head;
        ans.tail= head;
        return ans;
    }


    public static Node<Integer> reverseRBest(Node<Integer> head){
        if(head==null || head.next==null){
            return head;
        }
        Node<Integer> smallHead= reverseRBest(head.next);
        Node<Integer> reversedTail= head.next;
        reversedTail.next= head;
        head.next= null;
        return smallHead;
    }


    public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2){
        Node<Integer> t1= head1, t2= head2;
        Node<Integer> head= null, tail=null;
        if (head1==null)
        {
            return head2;
        }

        if (head2==null)
        {
            return head1;
        }

        if(t1.data<= t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }else{
            head= t2;
            tail=t2;
            t2=t2.next;
        }
        while(t1 != null && t2!= null){
            if(t1.data <= t2.data){
                tail.next= t1;
                tail=t1;
                t1= t1.next;
            }else{
                tail.next= t2;
                tail=t2;
                t2= t2.next;
            }
        }
        if(t1!= null){
            tail.next= t1;
        }else{
            tail.next=t2;
        }
        return head;

    }


    public static void main(String[] args) {
   // Node<Integer> head = takeInput();//createLinkedList();//   print(head);
        //  insertR(head,80,2);
        //  deleteR(head,3);
      //  reverseR(head);
      // head =reverseRBest(head);
     //  printR(head);
        Node<Integer> head1 = takeInput();
        Node<Integer> head2 = takeInput();
       Node<Integer> head =  merge(head1,head2);
       print(head);

    }
}
