import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ALRemove3 {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<String>();
        ls.add("Data 1");
        ls.add("Data 2");
        ls.add("Data 3");
        ls.add("Data 4");
        System.out.println("Data \t : " + ls);
        // Menghapus ArrayList secara urutan
        Iterator it = ls.iterator();

        while(it.hasNext()){
            // conversi dari objeck ke string
            String teks = String.valueOf(it.next());
            // conversi dari char ke string ke integer
            int index = Integer.valueOf(String.valueOf(teks.charAt(5)));
            if(index < 3){
                it.remove();
            }
        }
        System.out.println("Edit \t : " + ls);

        //  hasil
        //  Data     : [Data 1, Data 2, Data 3, Data 4]
        //  Edit     : [Data 3, Data 4]
    }
}
