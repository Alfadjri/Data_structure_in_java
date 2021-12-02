import java.util.HashSet;

public class HashSetClear {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add("data2");
        hs.add("data 3");
        hs.add("sw2");
        hs.add("2");

        System.out.println("Hashset : " + hs);

        // menghapus semua data 
        hs.clear();
        System.out.println("Setelah di hapus : " + hs);
    }
}
