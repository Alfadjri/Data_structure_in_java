package Data_structure_in_java.Vector;
import java.util.Vector;
public class VectorFirstElm {
    public static void main(String[] args) {
        Vector<Character> v = new Vector<>();
        v.add('a');
        v.add('b');
        v.add('c');
        v.add('d');
        System.out.println("Vector :" + v);

        // mendapatakan data paling awal
        // .firstElement()

        System.out.println("Isi dari data paling awal : " + v.firstElement());
        
    }
}
