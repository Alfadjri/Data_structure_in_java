package Data_structure_in_java.Vector;
import java.util.Vector;
import java.lang.Exception;
public class VectorEnsureCap {
    public static void main(String[] args) {
            try {
                Vector<Character> v = new Vector<>();
                v.add('a');
                v.add('b');
                v.add('c');
                v.add('d');
                System.out.println("Vector : " + v);
                // cek maksimum data yang dapat di tampung 
                System.out.println("Data yang dapat di tampung awal : " + v.capacity());
                // untuk menyiapkan nilai minimum  dari tampuangan Vector
                v.ensureCapacity(5000);
                // Setelah di minta alokasi data sebanyak 5000
                System.out.println("Data yang dapat di tampung setelah : " + v.capacity());

                

            } catch (Exception e) {
                System.err.println(e);
            }
    }
}
