package com.company;

import java.util.Scanner;


    class Queue1 {
        int front = -1;
        int rear = -1;
        int n = 4;
        int arr[] = new int[n];

        void enqueue(Scanner sc) {
            if (front == (rear+1)%n) {
                System.out.println("OverFlow");
            } else {
                System.out.print("enter data: ");
                int i = sc.nextInt();
                if (front == -1 && rear == -1) {
                    front = 0;
                    rear = 0;
                    arr[rear] = i;
                } else {
                    rear = (rear+1)%n;
                    arr[rear] = i;
                }
            }
        }

        void dequeue() {
            if (front == -1 && rear == -1) {
                System.out.println("underFlow Condition");
            }
            else if (front == rear) {
                System.out.println("underFlow Condition");
                front = -1;
                rear = -1;
            } else {
                front = (front+1)%n;
            }
        }

        void display() {
            int i;
            System.out.print("items are: ");
            for ( i = front; i != rear; i =(i+1)%n) {
                System.out.print(arr[i] + " ");
            }
            System.out.print(arr[i]+" ");
        }
    }
        public class Circular_Queue_UsingArray {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                Queue1 queue = new Queue1();
                int d, s;
                do {
                    System.out.println("press 1 for enqueue/press 2 for dequeue/press 3 for display");
                    System.out.print("Enter: ");
                    d = sc.nextInt();
                    switch (d) {
                        case 1:
                            queue.enqueue(sc);
                            break;
                        case 2:
                            queue.dequeue();
                            break;

                        case 3:
                            queue.display();
                            break;
                    }
                    System.out.println("enter 0 to go back to menu");
                    s = sc.nextInt();

                } while (s == 0);


            }
    }
