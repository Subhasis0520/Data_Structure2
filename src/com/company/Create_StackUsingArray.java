package com.company;

import java.util.Scanner;

class Stack
{
    Scanner sc = new Scanner(System.in);
    int n = 10;
    int arr[] = new int[n];
    int top = -1;

    public void push(){
        if (top ==(n-1)){
            System.out.println("Overflow");
        }else {
            System.out.println("enter data");
            int i = sc.nextInt();
            top = top+1;
            arr[top] = i;
        }
    }

    public void  pop(){
        if (top == -1){
            System.out.println("Underflow");
        }
        else {
            top = top -1;
        }
    }

    public void print(){
        System.out.println("items are");
        for (int j = top; j>=0; j--){
            System.out.print(arr[j]+ " ");
        }
    }
}
public class Create_StackUsingArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        int d,s;
        do {
            System.out.println("press 1 for push");
            System.out.println("press 2 for pop");
            System.out.println("press 3 for print");
            d = sc.nextInt();
            switch (d) {
                case 1:
                    stack.push();
                    break;
                case 2:
                    stack.pop();
                    break;

                case 3:
                    stack.print();
                    break;
            }
            System.out.println("enter 0 to go back to menu");
             s = sc.nextInt();

        } while (s == 0);

    }
}

