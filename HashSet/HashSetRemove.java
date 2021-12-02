import java.util.HashSet;

public class HashSetRemove {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();

        hs.add("1");
        hs.add("data2");
        hs.add("Data10");
        hs.add("data22");

        System.out.println("HashSet : " + hs);
        
        hs.remove("Data10");
        System.out.println("Data Setelah di hapus : " + hs);
    }    
}
