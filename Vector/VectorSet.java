package Data_structure_in_java.Vector;

import java.util.Vector;

public class VectorSet {
    public static void main(String[] args) {
        Vector<Character> v = new Vector<>();
        v.add('a');
        v.add('b');
        v.add('c');

        System.out.println("Vector : " + v);

        // menggnati nilai 
        // set(index,data)
        System.out.println("Data Yang akan di ganti " + v.set(1,'d'));
        
        // jika index tidak ada maka akan menggeluarkan pesan error
        // System.out.println("Data yang akan di ganti " + v.set(4,'c'));

        // Setelah di ganti
        System.out.println("Vectro setelah di update : " + v);
    }
}
