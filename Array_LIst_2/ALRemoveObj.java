
import java.util.List;
import java.util.ArrayList;
public class ALRemoveObj {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Data 1");
        ls.add("Data 2");
        ls.add("Data 3");
        ls.add("Data 4");
        System.out.println("Data \t : " + ls);

        // Menghapus data dengan Memasukan Datanya Langsung
        
        ls.remove("Data 4");
        System.out.println("Edit \t : " + ls);

        // hasil
        // Data     : [Data 1, Data 2, Data 3, Data 4]
        // Edit     : [Data 1, Data 2, Data 3]
    }
}
