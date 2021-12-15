package Data_structure_in_java.Hash_Map;
import java.util.HashMap;

public class HMGet {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Data 22", 12331);
        hm.put("Data 13", 132323);
        hm.put("Data 123", 123332);

        // cek size pada HashMap mengugnakan .size();
        System.out.println("Berapa size yang ada pada saat ini : " + hm.size());
        System.out.println("Hash Map : " + hm);
        System.out.println("Berapa nilai yang ada pada Data 22 : " + hm.get("Data 22"));
    }
}
