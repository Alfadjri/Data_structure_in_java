package Data_structure_in_java.Hash_Map;

import java.util.HashMap;

public class HMPut{
    public static void main(String[] args) {
        HashMap<Integer,String> hm1 = new HashMap<Integer,String>();
        HashMap<Integer,String> hm2 = new HashMap<Integer,String>();
        hm1.put(1,"Testing 1");
        hm1.put(4,"Testing 4");
        hm1.put(3,"Testing 3");
        hm1.put(2,"TEsting 2");

        hm2.put(4,"Testing 4");
        hm2.put(3,"Testing 3");
        hm2.put(5,"Testing 5");
        hm2.put(10,"Tetsing 10");

        System.out.println("Hash Map 1 : " + hm1);
        System.out.println("Hash Map 2 : " + hm2);
    }
}