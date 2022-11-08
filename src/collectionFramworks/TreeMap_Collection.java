package collectionFramworks;

import java.util.TreeMap;

public class TreeMap_Collection {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        
        map.put(1,"ABC");
        map.put(3,"DEF");
        map.put(5,"GHI");
        map.put(8,"JKL");
        map.put(12,"MNO");
        map.putIfAbsent(7,"XYZ");
        System.out.println(map);
        System.out.println(map.size());
        map.remove(5);
//        map.clear();
        System.out.println(map.isEmpty());
        System.out.println(map);
        for (int d: map.keySet() ) {
            System.out.println(d);
        }
        for (String s: map.values() ) {
            System.out.println(s);
        }
    }
}
