import java.util.Hashtable;

public class HashTableContains {
    public static void main(String[] args) {
        Hashtable<Integer,String> table = new Hashtable<Integer,String>();
        table.put(12,"Data");
        table.put(11,"String");
        table.put(1,"Data-Data");
        table.put(3,"String");

        System.out.println("Hash table : " + table);

        // cek nilai yang ada 
        System.out.println("Cek data String : " + table.contains("String"));

        // cek nilai yang tidak ada 
        System.out.println("Cek data Data 1 : " + table.contains("Data 1"));
    }
}
