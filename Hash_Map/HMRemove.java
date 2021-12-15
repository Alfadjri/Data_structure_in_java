package Data_structure_in_java.Hash_Map;
import java.util.HashMap;
public class HMRemove {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("Data1",1);
        hm.put("Data2",2);
        hm.put("Data3",3);

        System.out.println("Sebelum di hapus : " + hm);
        // menghapus nilai menggunakan .remove(key)
        hm.remove("Data3");
        System.out.println("Setelah di hapus Data3 : " + hm);


    }    
}
