package Data_structure_in_java.Vector;

import java.util.Vector;
import java.util.Collection;
import java.util.ArrayList;

public class VectorAddAll {
    public static void main(String[] args) {
        // memmanggil vektor dengan tipe sembarang 
        // dan menyimpannya dalam benutk tipe String

        Vector<String> v1 = new Vector<>();
        v1.add("Data 1");
        v1.add("Data 2");
        v1.add("Data 3");
        
        Collection<String> cl = new ArrayList<String>();
        cl.add("1");
        cl.add("2");
        cl.add("3");
        cl.add("4");
        cl.add("5");

        // mencetak vektor
        System.out.println("Vector 1 : " + v1);

        // memasukkan semua data sekaigus
        v1.addAll(cl);

        // menceteak setelah di update
        System.out.println("Vector 1 Add : " + v1);

    }
}
