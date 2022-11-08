package com.company;

import java.util.Scanner;

class QueueArr {
    int front = -1;
    int rear = -1;
    int n = 10;
    int arr[] = new int[n];

    void enqueue(Scanner sc) {
        if (rear == (n - 1)) {
            System.out.println("OverFlow");
        } else {
            System.out.print("enter data: ");
            int i = sc.nextInt();
            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                arr[rear] = i;
            } else {
                rear++;
                arr[rear] = i;
            }
        }
    }

    void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("underFlow Condition");
        } else {
            front++;
        }
    }

    void display() {
        System.out.print("items are: ");
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }

    public class Create_LinerQueueUsing_Array{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            QueueArr queue = new QueueArr();
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

}


