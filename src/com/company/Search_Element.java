package com.company;

import java.util.Scanner;

public class Search_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of element: ");
        int n = sc.nextInt();
        int arr[] =  new int[n];
        System.out.println("enter the elements");
        for (int i= 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the num want to check: ");
        int s = sc.nextInt();
        for (int i= 0; i<n;i++){
            if (s == arr[i]) {
                System.out.println("yes present");
                break;
            }
            }

    }
}
