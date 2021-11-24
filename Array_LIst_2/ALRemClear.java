import java.util.List;
import java.util.ArrayList;

public class ALRemClear {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Data 1");
        ls.add("Data 2");
        ls.add("Data 3");
        ls.add("Data 4");
        System.out.println("Data \t : " + ls);

        // cek banyak data dalam list
        System.out.println("Banyak Data dalam list : " + ls.size());
        // menghpus semua data
        ls.clear();
        // cek
        System.out.println("Edit \t : " + ls);
        // cek banyak datanya
        System.out.println("Banyak Data dalam list : " + ls.size());

        // hasil
        // Data     : [Data 1, Data 2, Data 3, Data 4]
        // Banyak Data dalam list : 4
        // Edit     : []
        // Banyak Data dalam list : 0
    }    
}
