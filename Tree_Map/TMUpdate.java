package Tree_Map;
import java.util.TreeMap;
public class TMUpdate {
    public static void main(String[] args) {
        TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();

        tm.put('a',1);
        tm.put('c',2);
        tm.put('b',3);

        // tampilkan sebelum berubah
        System.out.println("Before Update Map : " + tm);
        // memperbarui data
        // syarat memperbarui adata dengan key yasn sama
        tm.put('c',5);
        // Setelah di updarte
        System.out.println("After Update Map : " + tm);
    }
}
