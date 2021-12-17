package Data_structure_in_java.Array_LIst_2;
import java.util.List;
import java.util.ArrayList;

public class ALRemove {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Data 1");
        ls.add("Data 2");
        ls.add("Data 3");
        ls.add("Data 4");
        System.out.println("Data \t : " + ls);
        // menghapus list data terakhir
        int index = ls.size()-1;
        ls.remove(index);
        System.out.println("Edit \t : " + ls);


        // Hasil 
        // Data     : [Data 1, Data 2, Data 3, Data 4]
        // Edit     : [Data 1, Data 2, Data 3]
    }
}