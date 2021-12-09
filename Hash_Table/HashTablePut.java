import java.util.Hashtable;

public class HashTablePut {
    public static void main(String[] args) {
        // membaut HashTable 
        Hashtable<Integer,String> t = new Hashtable<Integer,String>();
        // memasukan HashTable
        t.put(1,"Data");
        t.put(3,"String");
        t.put(2,"Integer");
        t.put(10,"IF-A");
        // Menampilakn Hash table
        System.out.println("Hash Tabel : " + t);
    }
}