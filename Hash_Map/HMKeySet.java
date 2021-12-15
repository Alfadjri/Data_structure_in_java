package Data_structure_in_java.Hash_Map;

import java.util.HashMap;
import java.util.Set;
import java.util.Collection;

public class HMKeySet {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        hm.put("Data1", 2000);
        hm.put("Data2", 3000);
        hm.put("Data3", 4000);
        // .KeySet() berguna untuk mengambil semua key yang ada di Hashmap
        Set<String> hmKey = hm.keySet();

        System.out.println("Cek Key " + hmKey);
        // .values() berguna untuk mengambil semua value yang ada di HashMap
        Collection<Integer> hmValue = hm.values();

        System.out.println("Value : " + hmValue);

        hm.put("Data4", 5000);

        System.out.println("update Key : " + hmKey);

        System.out.println("update Value : " + hmValue);

    }
}
