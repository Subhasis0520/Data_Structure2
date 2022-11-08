package com.company;
public class Generics_Array {
    public static <T> void print(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Integer arr[] = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 4;
        }
        print(arr);

        String arrS[] = new String[5];
        for (
                int i = 0;
                i < arrS.length; i++) {
            arrS[i] = "abc";
        }
        print(arrS);
    }
}
