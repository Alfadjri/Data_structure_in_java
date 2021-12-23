package Tree_Map;

import java.util.TreeMap;

public class TMRem {
    public static void main(String[] args) {
        TreeMap<Character,String> tm = new TreeMap<Character,String>();
    
        tm.put('z',"Data 10");
        tm.put('x',"Data 12");
        
        // menampilkan data sebelum di hapus
        System.out.println("Before remove TreeMap : " + tm);
        tm.remove('z');
        // Setelah remove
        System.out.println("After remove TreeMap : " + tm);
    }

}
