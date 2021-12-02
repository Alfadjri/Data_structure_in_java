import java.util.HashSet;

public class HashSetContstrain {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add("Data1");
        hs.add("2");
        hs.add("c");
        hs.add("3");

        System.out.println("HashSet : " + hs);

        // cek file ada tau tidak
        // constrain berguna untuk mengecek data dan mengeluarkan nilai booelan
        // constrain("Data yang akan di cari ")

        System.out.println("Cek apakah data dengan judul 2 ada : " + hs.contains("2"));

    }
}
