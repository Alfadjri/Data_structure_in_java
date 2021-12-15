package Data_structure_in_java.Hash_Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class HMEnterySet {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Data1",1);
        hm.put("Data2",2);
        hm.put("Data3",3);
        // entrySet() berguna untuk memasukan semua nilai yang ada pada Hash MAp
        Set<Map.Entry<String,Integer>> st = hm.entrySet();

        System.out.println("Nilai yang ada pada Set<Map.Entry<String,Integer>> : " + st);
        
        // getOrDefault(key , value) berguna untuk mengecek jika key ada maka gunakan value yang ada jika key tidak ada maka masukan value tersebut
        // contoh key ada 
        System.out.println("Using.getOrDefault : " + hm.getOrDefault("Data1", 22));
        // contoh key tidak ada
        System.out.println("Using.getOrDefault : " + hm.getOrDefault("Data4", 4));

        //.replace(key,newValue) di gunakan untuk mengganti nilai berdasarkan key
        hm.replace("Data2", 22);
        System.out.println("Ubah value Data2 dari 2 menjadi 22  : " + st );
        // memasukan data jika key tidak ada
        // jika key tidak ada 
        hm.putIfAbsent("Data4", 4);
        System.out.println("Menambah Data 4 dengan value 4 : " + st);
        // jika key ada 
        hm.putIfAbsent("Data3", 5);
        System.out.println("Mengganti Data3 dengan value 5 : " + st);

    }
}
