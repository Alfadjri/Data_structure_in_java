import java.util.Hashtable;

public class HashTableEquals {
    public static void main(String[] args) {
        Hashtable<Integer,String> tb = new Hashtable<Integer,String>();
        Hashtable<Integer,String> tb2 = new Hashtable<Integer,String>();

        tb.put(3,"Testing");
        tb.put(1,"Analisis");
        tb.put(2,"Code");
        tb2.put(2,"Code");
        tb2.put(3,"Testing");
        tb2.put(1,"Analisis");

        // print isi dari table 1 dan table 2
        System.out.println("table 1 : " + tb);
        System.out.println("table 2 : " + tb2);

        // cek apakah sama atau tidak 
        System.out.println("cek Apa table 1 sama dengan table 2 : " + tb.equals(tb2));
    }
}
