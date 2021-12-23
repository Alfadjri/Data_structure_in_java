package Tree_Map;

import java.util.TreeMap;

public class TMContainsKey {
    public static void main(String[] args) {
        TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

        tm.put('a', 1);
        tm.put('c', 3);
        tm.put('z', 10);

        // mengukur panjang size treeMap
        System.out.println("Banyak Data pada Map : " + tm.size());

        // cek data
        if (tm.containsKey('z')) {
            int value = tm.get('z');
            System.out.println("Value Of key  z  is :" + value);
        }
    }
}
