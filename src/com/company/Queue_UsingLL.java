package com.company;

 class Queue_LL {

     static class Node {
         int data;
         Node next;

         Node(int data) {
             this.data = data;
             this.next = null;
         }
     }

     private Node front;
     private Node rear;
     int size;

     public Queue_LL() {
         front = null;
         rear = null;
         size = 0;
     }

     public int size() {
         return size;
     }

     public boolean isEmpty() {
         return size == 0;
     }

     public int front() {
         if (front == null) {
             System.out.println("Queue is empty");
         }
         return front.data;
     }

     public void enqueue(int elem) {
         Node newNode = new Node(elem);
         size++;
         if (rear == null) {
             front = newNode;
             rear = newNode;
         } else {
             rear.next = newNode;
             rear = newNode;
         }
     }

     public int dequeue() {
         if (front == null) {
             System.out.println("Queue is empty");
         }
         int temp = front.data;
         front = front.next;
         if (front == null) {
             rear = null;
         }
         size--;
         return temp;
     }

 }
public  class Queue_UsingLL{
    public static void main(String[] args) {
        Queue_LL queue = new Queue_LL();
        int arr[] = {9,6,5,4,2,7};
        for (int elem : arr) {
                queue.enqueue(elem);
        }
        if (!queue.isEmpty()){
            try {
                System.out.println(queue.dequeue());
            }catch (Exception ex){
                System.out.println("never catch");
            }

        }
    }

}


