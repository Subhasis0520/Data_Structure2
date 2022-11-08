package com.company;
class Student implements printInterface{
    int rollNumber;

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    @Override
    public void print() {
        System.out.println(rollNumber);
    }
}
 interface printInterface{
    void print();
 }
public class Bounded_Generics {
    public static <T extends printInterface> void print(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
           arr[i].print();
        }
    }

    public static void main(String[] args) {
        Student s [] = new Student[5];
        for (int i = 0; i < s.length; i++) {
            s[i] =new Student(7*i/2 +i+2);
        }
        print(s);
    }
}
