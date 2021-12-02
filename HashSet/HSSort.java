import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class HSSort {
    public static void main(String[] args) {
        HashSet hs = new HashSet<>();
        hs.add("Data A");
        hs.add("Data 2");
        hs.add("Data 10");
        hs.add("Data 3");
        hs.add("Data B");

        System.out.println("HashSet : " + hs);

        // ubah dalam tipe data yang lain di sini saya menggunaka tipe data 
        // LIst dan ArrayList;

        List<String> list = new ArrayList<String>(hs);
        //Collection berguna untuk menggumupkan datan dan memasukannya kemabil dalam list
        Collections.sort(list);

        System.out.println("Setelah di sort : " + list);
        
    }
}
