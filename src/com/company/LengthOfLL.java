package com.company;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data =data;
    }

}

public class LengthOfLL {
    public static LinkedListNode<Integer> createLinkedList() {
        LinkedListNode<Integer> n1 = new LinkedListNode<>(10);
        LinkedListNode<Integer> n2 = new LinkedListNode<>(20);
        LinkedListNode<Integer> n3 = new LinkedListNode<>(30);
        LinkedListNode<Integer> n4 = new LinkedListNode<>(40);
        n1.next = n2;
        n2.next= n3;
        n3.next =n4;
        return n1;
    }
    public static void print(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }
    public static int length(LinkedListNode<Integer> head){
    LinkedListNode<Integer> temp = head;
    int count =0;
    while (temp != null){
        count++;
        temp.next= temp;
    }
    return count;
    }


    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {

        if (head ==null){
            return head;
        }
        else if(pos==0)
        {
            head=head.next;
        }
        else
        {
            LinkedListNode<Integer> n=head, delNode=null;
            for (int i=0;i<pos-1 && n!=null;i++)
            {
                n=n.next;
            }
            if (n!=null && n.next!=null)
            {
                if (n.next!=null)
                {
                    n.next=n.next.next;
                }
                else
                {
                    n.next=null;
                }

            }
        }
        return head;
    }

    public  static  void printR (LinkedListNode<Integer> head){
        if (head == null){
            return;
        }
        System.out.print(head.data + " ");
        printR(head.next);
    }
    public static void main(String[] args) {
    LinkedListNode<Integer> head = createLinkedList();
          printR(head);
//          print(head);
          deleteNode(head,0);

    }
}
