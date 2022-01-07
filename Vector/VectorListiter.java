package Data_structure_in_java.Vector;

import java.util.Vector;
import java.util.ListIterator;

public class VectorListiter {
    public static void main(String[] args) {
        Vector<String> vt = new Vector<>();

        vt.add("Structure");
        vt.add("Data 2");
        vt.add("Data");

        ListIterator lt = vt.listIterator();

        while(lt.hasNext()){
            System.out.println(lt.next());
        }

        // membalik data
        System.out.println("Urutan data dari bawah ke atas");
        while(lt.hasPrevious()){
            System.out.println(lt.previous());
        }
    }
}
