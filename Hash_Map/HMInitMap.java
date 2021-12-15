package Data_structure_in_java.Hash_Map;
import java.util.HashMap;
import java.util.Map;
public class HMInitMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        

        hm.put(10,"Data1");
        hm.put(12,"Data12");
        hm.put(14,"Data14");
        

        Map<Integer,String> mp = new HashMap<Integer,String>(hm);

        System.out.println("Data yang akan di Clone : " + hm);
        System.out.println("Data setelah di clone : " + mp);

    }
}
