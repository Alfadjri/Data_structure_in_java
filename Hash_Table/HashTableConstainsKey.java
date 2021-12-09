import java.util.Hashtable;
public class HashTableConstainsKey {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();

        ht.put("Note" , 2000);
        ht.put("Book" , 5000);
        ht.put("Bil" , 20021);
        System.out.println("Data table " + ht );
        System.out.println("Cek apa kah nilai Book ada dalam table " +ht.containsKey("Book"));
    }
}
