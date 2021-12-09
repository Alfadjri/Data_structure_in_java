import java.util.Hashtable;
public class HTGet {
    public static void main(String[] args) {
        Hashtable<String,Integer> ht = new Hashtable<String,Integer>();

        ht.put("Buku",75000);
        ht.put("Tas",300000);
        ht.put("Leptop",7000000);
        ht.put("Mouse",400000);

        System.out.println("Key : " +"Tas");
        System.out.println("Value : " + ht.get("Tas"));
    }
}
