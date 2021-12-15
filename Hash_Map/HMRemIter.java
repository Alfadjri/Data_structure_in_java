package Data_structure_in_java.Hash_Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class HMRemIter {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Data1",1);
        hm.put("Data2",2);
        hm.put("Data3",3);

        Set<Map.Entry<String,Integer>> st = hm.entrySet();

        System.out.println("Original HashMap : " + st);

        Iterator<Map.Entry<String,Integer>> it = hm.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String,Integer> mp = it.next();
            it.remove();
            System.out.println("Iterator remove : " + st);
        }
    }
}
