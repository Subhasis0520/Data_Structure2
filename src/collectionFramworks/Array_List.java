package collectionFramworks;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(30);
        array.add(50);
        array.add(70);
        array.add(100);
        //array.remove(2);
        array.set(3,254);
        System.out.print(array);
        boolean f = array.contains(254);
        System.out.println(f);
        int c = array.get(1);
        System.out.println(c);

//        from of array
        for (int i =0; i<array.size();i++){
            System.out.print(array.get(i)+ " ");
        }
    }
}
