package Data_structure_in_java.Hash_Map;
import java.util.HashMap;
public class HMChangeElm {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();

        hm.put("Data 1" , 123);
        hm.put("Data 2" , 12);
        hm.put("Data 3" , 1);

        System.out.println("Sebelum di rubah : " + hm);

        hm.put("Data 2", 1);
        hm.put("Data 3", 123);
        hm.put("Data 1", 12);
        System.out.println("Setelah di update : " + hm);

    }
}
