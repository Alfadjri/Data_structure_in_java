package Data_structure_in_java.Hash_Map;
import java.util.HashMap;
import java.util.Map;

public class HMGetKeyValue {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        hm.put("Data 1" , 1);
        hm.put("Data 2" , 2);
        hm.put("Data 3" , 3);

        // looping type Map
        // Hash.Entry berugan untuk memasukan nilai ke dalam map sekaligus
        // hm.entrySet() berugan untuk mengambil semua nilai yang ada di hasmap
        // get value hanya ada di map 
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            // e.getKey() menggambil nilai key secara urut 
            // e.getValue() mengmabil nilai secara berurut

            System.out.println("Key : " + e.getKey() + " Value  : " + e.getValue());
        }
    }
}
