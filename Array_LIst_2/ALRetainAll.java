
import java.util.ArrayList;
import java.util.List;

public class ALRetainAll {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Data 1");
        ls.add("Data 2");
        ls.add("Data 3");
        ls.add("Data 4");
        System.out.println("Data 1 \t : " + ls);
        
        List<String> la = new ArrayList<>();
        la.add("Data 1 ");
        la.add("Data 10");
        la.add("Data 32");
        la.add("Data 4");
        la.add("Data 2");
        System.out.println("Data 2 \t : " + la);

        // menghpus data yang tidak ada pada ls 
        // jika data acuan kosong maka akan merubah semua isi yang di uji menjadi kosong
        la.retainAll(ls);

        System.out.println("Edit Data 2 : " + la);
        
        
        // hasil
        // Data 1   : [Data 1, Data 2, Data 3, Data 4]
        // Data 2   : [Data 1 , Data 10, Data 32, Data 4, Data 2]
        // Edit Data 2 : [Data 4, Data 2]

    }
    
}
