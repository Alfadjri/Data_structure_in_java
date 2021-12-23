package Tree_Map;
import java.util.TreeMap;
public class TMPut {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
        // memasukan ke dalam tree map
        tm.put("Data 1", 1);
        tm.put("Data 3", 3);
        tm.put("Data 2", 2);
        tm.put("Data 0", 00);
        TreeMap<String,Integer> tm2 = new TreeMap<String,Integer>(tm);

        // menampilkan data
        System.out.println("Tree Map 1 : " + tm);
        System.out.println("Tree Map 2 : " + tm2);

        // memabandikan data
        System.out.println("Apa kah sama isi dari Map 1 dan Map 2  : " + tm.equals(tm2));
        
    }
}
