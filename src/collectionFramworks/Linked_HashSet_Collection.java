package collectionFramworks;

import java.util.LinkedHashSet;

public class Linked_HashSet_Collection {
    public static void main(String[] args) {
        LinkedHashSet<Integer> hash = new LinkedHashSet<>();
        hash.add(25);
        hash.add(35);
        hash.add(45);
        hash.add(65);
        hash.add(55);
        hash.add(25);
        System.out.println(hash);
        hash.remove(45);
        System.out.println(hash.contains(65));
//        hash.clear();
        System.out.println(hash);
        System.out.println(hash.size());
    }
}
