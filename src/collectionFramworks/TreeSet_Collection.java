package collectionFramworks;

import java.util.TreeSet;

public class TreeSet_Collection {
    public static void main(String[] args) {
        TreeSet<Integer> tree = new TreeSet<>();
        tree.add(25);
        tree.add(35);
        tree.add(45);
        tree.add(65);
        tree.add(55);
        tree.add(25);
        System.out.println(tree);
        tree.remove(45);
        System.out.println(tree.contains(65));
//        hash.clear();
        System.out.println(tree);
        System.out.println(tree.size());
    }
}
