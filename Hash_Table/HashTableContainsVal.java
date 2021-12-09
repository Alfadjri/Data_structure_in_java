import java.util.Hashtable;
public class HashTableContainsVal {
    public static void main(String[] args) {
        Hashtable<String,Integer> table = new Hashtable<String,Integer>();
        table.put("Gitar" , 2000000);
        table.put("Bar",20000000);
        table.put("Bir",123212);

        System.out.println("Hash Table : " + table);

        System.out.println("Apakah isi ada barang yang haraganya : " + table.containsValue(20000000));
    }
}
