package collectionFramworks;

import java.util.Scanner;
import java.util.Stack;

public class StackInCollection {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

//        Scanner sc = new Scanner(System.in);
//        for (int i =0; i<5;i++){
//            System.out.print("Enter the data: ");
//            int value = sc.nextInt();
//            s.push(value);
//        }

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        System.out.print(s);
        System.out.println(s.peek());
        System.out.println(s.search(30));
        System.out.println(s.isEmpty());
        s.pop();
        s.pop();
        System.out.print(s);
    }
}
