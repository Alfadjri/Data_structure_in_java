import java.util.HashSet;

public class HashSetRetainAl {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();

        hs.add("Data1");
        hs.add("Data2");
        hs.add("Data3");
        hs.add("Data5");

        HashSet hs2 = new HashSet<>();
        hs2.add("Data2");
        hs2.add("Data5");

        System.out.println("HashSet : " + hs);
        System.out.println("Data yang akan di pertahankan " + hs2);

        // menghapus yang tidak di guanakan

        hs.retainAll(hs2);

        System.out.println("Hashset : " + hs);

         // sebisa mungkin menggunakan try dan catch agar tidak berhenti
        // programnya saat terjadi kesalahan
    }
}
