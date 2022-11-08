package com.company;

class Queue_UsingArray {
    private int []data;
    private int front;
    private int rear;
    private int size;

    public Queue_UsingArray() {
        data = new int[5];
        front = -1;
        rear = -1;
        size = 0;
    }

    public Queue_UsingArray(int capacity) {
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int elem) {
        if(size == data.length) {
            System.out.println("Queue overFlow");
            doubleCapacity();
        }
        if(size == 0) {
            front++;
        }
        rear++;
        if(rear == data.length) {
            rear = 0;
        }
        data[rear] = elem;
        size++;

    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2*temp.length];
        int index = 0;
        for (int i = front; i<temp.length;i++){
            data[index++] = temp[i];
        }
        for (int i = 0; i< front-1;i++){
            data[index++] = temp[i];
        }
    }

    public int front() {
        if(size == 0) {
            System.out.println("Queue underFlow");
        }
        return data[front];
    }

    public int dequeue() {
        if(size == 0) {
            System.out.println("Queue underFlow");
        }
        int temp = data[front];
        front++;
        if(front == data.length) {
            front = 0;
        }
        size--;
        if(size==0) {
            front = -1;
            rear = -1;
        }
        return temp;

    }

}

public class Queue_UsingAL {
    public static void main(String[] args) {
        Queue_UsingArray queue = new Queue_UsingArray();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(50);
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
    }

}
