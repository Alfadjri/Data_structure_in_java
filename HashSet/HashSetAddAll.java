import java.util.HashSet;

public class HashSetAddAll {
    public static void main(String[] args) {
        HashSet hs1 = new HashSet<>();
        hs1.add("Data1");
        hs1.add("Data2");
        hs1.add("Data3");
        hs1.add("Data4");
        hs1.add("Data10");

        HashSet hs2 = new HashSet<>();
        hs2.add("Data2");
        hs2.add("Data3");
        hs2.add("Data5");
        hs2.add("Data6");



        System.out.println("Hashset 1 : " + hs1);
        System.out.println("Hashset 2 : " + hs2);

        // mengabungkan data
        hs1.addAll(hs2);

        System.out.println("Setelah di tambahkan Hashset 2  : " + hs1);

    }
}
