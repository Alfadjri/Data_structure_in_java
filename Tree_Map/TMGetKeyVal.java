package Tree_Map;

import java.util.TreeMap;
import java.util.Map;

public class TMGetKeyVal {
    public static void main(String[] args) {
        TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();

        tm.put('a',12);
        tm.put('d',223);
        tm.put('b',1);

        // cara loop semua data menggungakna forloop
        System.out.println("Key \t|\t value ");
        for(Map.Entry map : tm.entrySet()){
            char key = (char) map.getKey();
            int value = (int) map.getValue();

            // print 
            System.out.println(key + " \t|\t " + value);
        }
    }
}
