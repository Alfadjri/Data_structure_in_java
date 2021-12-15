package Data_structure_in_java.Hash_Map;
import java.util.HashMap;

public class HMContainsKey {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Data 2 ", 12);
        hm.put("Data 112", 2321);
       
        
        // cek size
        System.out.println("Size Hash Map : " + hm.size());
        
        // mencetak nilai yang ada dalam HashMap
        System.out.println("Hash Map : " + hm);

        // cek  nilai yang ada menggunakan containsKey

        if(hm.containsKey("Data 112")){
            int a = hm.get("Data 112");
            System.out.println("nilai yang di miliki Data 112 : " + a);
        }else{
            System.out.println("Data tidak di miliki ");
        }
    }
}
