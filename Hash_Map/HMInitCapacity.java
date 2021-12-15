package Data_structure_in_java.Hash_Map;
import java.util.Map;
import java.util.HashMap;

public class HMInitCapacity {
    public static void main(String[] args) {
        // new HashMap<Intger,String>(kapasitas yang di perlukan);
        Map<Integer,String> mp = new HashMap<Integer,String>(3);
        HashMap<Integer,String> hp = new HashMap<Integer,String>(2);

        mp.put(1,"String 1");
        mp.put(13,"String 2");
        hp.put(2,"String 2");
        hp.put(22,"String 2");
        hp.put(3,"String 3");

        System.out.println("Map : " + mp);
        System.out.println("Hash Map : " + hp);

    }
}
