package collectionFramworks;

import java.util.HashSet;

public class HashSet_Collection {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(100);
        set.add(140);
        set.add(170);
        set.add(210);
        set.add(250);
        System.out.println(set);
        System.out.println(set.contains(80));
        System.out.println(set.size());
//        set.clear();
        set.remove(170);
        System.out.println(set);
    }
}
