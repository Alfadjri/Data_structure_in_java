package Data_structure_in_java.Vector;
import java.util.Vector;

public class VectorSetElmAt {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);

        System.out.println("Vector : " + v);

        // mengganti nilai menggunakan 
        // setElementAt(DatayangDiganti,posisiDatayangMauDiganti)
        // index di hitung mulai dari 0
        
        v.setElementAt(4, 2);

        System.out.println("Setelah Di update : " + v);
    }
}
