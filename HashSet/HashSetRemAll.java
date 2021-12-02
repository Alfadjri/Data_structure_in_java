import java.util.HashSet;

public class HashSetRemAll {
    public static void main(String[] args) {
        HashSet hr = new HashSet<>();

        hr.add("Data1");
        hr.add("Data2");
        hr.add("Data3");
        hr.add("Data4");
        hr.add("Data5");
        hr.add("Data6");
        hr.add("data7");


        HashSet hr2 = new HashSet<>();
        hr2.add("Data1");
        hr2.add("Data2");
        hr2.add("Data6");
        hr2.add("data7");

        System.out.println("HashSet : " + hr);

        System.out.println("Data yang akan di remove : " + hr2);

        // menghapus
        hr.removeAll(hr2);

        System.out.println("Data Setelah Di hapus : "  + hr);


        // sebisa mungkin menggunakan try dan catch agar tidak berhenti
        // programnya saat terjadi kesalahan
    }
}
